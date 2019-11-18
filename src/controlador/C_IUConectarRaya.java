package controlador;

import interfaz.DAO_Usuario;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Juego;
import modelo.DAO_Usuario_Impl;
import modelo.ValidacionEntrada;
import vista.IUConectarRaya;


public class C_IUConectarRaya{
    
    private IUConectarRaya vista;
    private final Juego conectarRaya;
    DAO_Usuario bd = new DAO_Usuario_Impl();
    //--
    private final Color rojo = new Color(195, 44, 14);
    private final Color amarillo = new Color(255, 227, 11);
    
    public C_IUConectarRaya() {
        conectarRaya = new Juego();
        iniciarVista();
        vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
        //
        registrarEventos();
        //********************************************************************
        java.awt.EventQueue.invokeLater(this::actualizarTablaUsuarios);
        java.awt.EventQueue.invokeLater(this::actualizarListasDesplegable);
        java.awt.EventQueue.invokeLater(this::actualizarPodio);

    }
    
    private void iniciarVista(){
        vista = new IUConectarRaya();        
        vista.setVisible(true);
    }
    
    private void registrarEventos(){
        jB_Salir_ActionListener();
        jB_Iniciar_ActionListener();
        jB_Agregar_ActionListener();
        jB_Modificar_ActionListener();
        //
        jTB_Oro_ActionListener();
        jTB_Plata_ActionListener();
        jTB_Bronce_ActionListener();
        //
        jT_Usuario_MouseListener();
        //
        //pestanas_MouseListener();
        //
        jS_Fila();
        jS_Columna();
        jS_Raya();                
        //
        tablero_MouseMotion();
        tablero_Mouse();
    }
    
    private void establecerHabilitadosComponentes(boolean valor){
        vista.jCB_1.setEnabled(valor);
        vista.jCB_2.setEnabled(valor);
        vista.jTabbedPane1.setEnabledAt(1, valor);
        vista.jS_Fila.setEnabled(valor);
        vista.jS_Columna.setEnabled(valor);
        vista.jS_Raya.setEnabled(valor);
    }
    
    private void actualizarTablaUsuarios(){//----------------------------------------------------------------------
        try {
            vista.jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
                    bd.listar(),
                    new String [] {
                        "id", ""
                    }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false
                };
                
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            if (vista.jTableUsuario.getColumnModel().getColumnCount() > 0) {
                vista.jTableUsuario.getColumnModel().getColumn(0).setMinWidth(0);
                vista.jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(0);
                vista.jTableUsuario.getColumnModel().getColumn(0).setMaxWidth(0);
            }
        } catch (Exception ex) {
            Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void actualizarListasDesplegable(){
        try {            
            vista.jCB_1.setModel(new javax.swing.DefaultComboBoxModel<>(bd.listarXNombre()));
            vista.jCB_2.setModel(new javax.swing.DefaultComboBoxModel<>(bd.listarXNombre()));
        } catch (Exception ex) {
            Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    private void actualizarEstadistica(){
        switch (conectarRaya.turnoJugador) {
            case 1:
                vista.jTF_TurnoA.setBackground(rojo);
                vista.jTF_TurnoA.setText(String.valueOf(vista.jCB_1.getSelectedItem()));
                break;
            case 2:
                vista.jTF_TurnoA.setBackground(amarillo);
                vista.jTF_TurnoA.setText(String.valueOf(vista.jCB_2.getSelectedItem()));
                break;
            default:
                vista.jTF_TurnoA.setBackground(null);
                vista.jTF_TurnoA.setText("...");
                break;
        }
        vista.jL_TotalTiros.setText(""+conectarRaya.totalTiros);
    }
    
    private void actualizarPodio(){
        try {
            int aux[] = bd.obtener3primerosPuntajes();            
            String aux2[] = null;
            byte indice = 0;
            
            if(vista.jTB_Oro.isSelected()){
                indice = 0;
            }else if(vista.jTB_Plata.isSelected()){
                indice = 1;
            }else{
                indice = 2;
            }
            if(aux[indice]>0){
                vista.jL_Podio.setText("Victorias: "+aux[indice]);
                aux2 = bd.listarNombreXvictorias(aux[indice]);
                vista.jList_Podio.setModel(new javax.swing.DefaultComboBoxModel<>(aux2));
            }else{
                vista.jL_Podio.setText("...");                
                vista.jList_Podio.setModel(new javax.swing.DefaultComboBoxModel<>());
            }
        } catch (Exception ex) {
            Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//Eventos Listener    
    //
    private void jTB_Oro_ActionListener() {
        vista.jTB_Oro.addActionListener((java.awt.event.ActionEvent evt) -> {
            java.awt.EventQueue.invokeLater(this::actualizarPodio);
        });
    }
    
    private void jTB_Plata_ActionListener() {
        vista.jTB_Plata.addActionListener((java.awt.event.ActionEvent evt) -> {
            java.awt.EventQueue.invokeLater(this::actualizarPodio);
        });
    }
    
    private void jTB_Bronce_ActionListener() {
        vista.jTB_Bronce.addActionListener((java.awt.event.ActionEvent evt) -> {
            java.awt.EventQueue.invokeLater(this::actualizarPodio);
        });
    }
    //
    private void jB_Salir_ActionListener() {
        vista.jB_Salir.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.exit(0);
        });
    }    
    
    private void jB_Iniciar_ActionListener() {
        vista.jB_Iniciar.addActionListener((java.awt.event.ActionEvent evt) -> {
            if((vista.jPTablero1.animacion.isRunning())==false){
                switch (vista.jB_Iniciar.getText()) {
                    case "Iniciar Partida":
                        if(vista.jCB_1.getSelectedIndex() == 0 || vista.jCB_2.getSelectedIndex() == 0)
                            JOptionPane.showMessageDialog(vista, "Seleccione los jugadores");
                        else if(vista.jCB_1.getSelectedItem().equals(vista.jCB_2.getSelectedItem()))
                            JOptionPane.showMessageDialog(vista, "Seleccione jugadores diferentes");
                        else{
                            conectarRaya.reiniciar();
                            conectarRaya.iniciar();
                            vista.jB_Iniciar.setText("Cancelar");
                            establecerHabilitadosComponentes(false);
                            actualizarEstadistica();
                            vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
                        }
                        break;
                    case "Reiniciar"://---------------------------------------------------------------
                        vista.jPTablero1.vaciarFichas();
                        establecerHabilitadosComponentes(true);
                        conectarRaya.detener();
                        conectarRaya.totalTiros = 0;
                        actualizarEstadistica();
                        vista.jB_Iniciar.setText("Iniciar Partida");                        
                        break;
                    case "Cancelar":                        
                        if(conectarRaya.totalTiros==0)
                            vista.jB_Iniciar.setText("Iniciar Partida");
                        else
                            vista.jB_Iniciar.setText("Reiniciar");
                        conectarRaya.detener();
                        actualizarEstadistica();
                        establecerHabilitadosComponentes(true);
                        break;
                    default:
                        break;
                }
            }    
        });
    }  
    
    private void jB_Agregar_ActionListener() {
        vista.jB_Agregar.addActionListener((java.awt.event.ActionEvent evt) -> {            
            vista.jTF_username.setText(vista.jTF_username.getText().trim());
            if(vista.jTF_username.getText().equals(""))
                JOptionPane.showMessageDialog(vista, "Para Ingresar jugador...\ningrese el nombre del jugador en la caja de texto");
            else if( ValidacionEntrada.validarUsername( vista.jTF_username.getText() ) ){
                try {
                    bd.insertar(vista.jTF_username.getText());
                    actualizarTablaUsuarios();
                    vista.jTF_username.setText("");
                    java.awt.EventQueue.invokeLater(this::actualizarListasDesplegable);
                } catch (Exception ex) {
                    if( ex.getMessage().indexOf("USERNAME_UNIQUE")!=-1 ){
                        JOptionPane.showMessageDialog(vista, "Error... el usuario ya existe");
                    }else{
                        Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex.getCause());
                    }
                }
            }else{
                JOptionPane.showMessageDialog(vista, "Nombre de usuario no válido");
            }
        });
    }
    
    private void jB_Modificar_ActionListener() {
        vista.jB_Modificar.addActionListener((java.awt.event.ActionEvent evt) -> {
            if(vista.jTableUsuario.getSelectedRow()!=-1){
                vista.jTF_username.setText(vista.jTF_username.getText().trim());
                if( ValidacionEntrada.validarUsername( vista.jTF_username.getText() ) ){
                    try {
                        bd.modificar(
                                vista.jTF_username.getText(),
                                Integer.parseInt(String.valueOf(vista.jTableUsuario.getValueAt(vista.jTableUsuario.getSelectedRow(), 0))));
                        actualizarTablaUsuarios();
                        vista.jTF_username.setText("");
                    } catch (Exception ex) {
                        Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(vista, "Nombre de usuario no válido");
                }
            }else
                JOptionPane.showMessageDialog(vista, "Para modificar...\nSeleccione el nombre de jugador a modificar de la tabla");
        });
    }  
    
    private void jT_Usuario_MouseListener() {
        vista.jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(vista.jTableUsuario.getSelectedRow()!=-1){
                    vista.jTF_username.setText(String.valueOf(vista.jTableUsuario.getValueAt(vista.jTableUsuario.getSelectedRow(), 1)));
                }
            }
        });
    }
    
    private void jS_Fila() {
        vista.jS_Fila.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            conectarRaya.reiniciar();
            conectarRaya.objTablero.setFilas( (byte)Integer.parseInt(String.valueOf(vista.jS_Fila.getValue())) );
            vista.jS_Fila.setValue(conectarRaya.objTablero.getFilas());
            vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
            if( conectarRaya.sizeRaya > conectarRaya.objTablero.getFilas() ){
                conectarRaya.validar_y_Asignar_SizeRaya((byte)(conectarRaya.sizeRaya-1));
                vista.jS_Raya.setValue(conectarRaya.sizeRaya);
            }
        });
    }
    
    private void jS_Columna() {
        vista.jS_Columna.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            conectarRaya.reiniciar();
            conectarRaya.objTablero.setColumnas((byte)Integer.parseInt(String.valueOf(vista.jS_Columna.getValue())) );
            vista.jS_Columna.setValue(conectarRaya.objTablero.getColumnas());
            vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
            if( conectarRaya.sizeRaya > conectarRaya.objTablero.getColumnas()){
                conectarRaya.validar_y_Asignar_SizeRaya((byte)(conectarRaya.sizeRaya-1));
                vista.jS_Raya.setValue(conectarRaya.sizeRaya);
            }
                
        });
    }
    
    private void jS_Raya() {
        vista.jS_Raya.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            conectarRaya.validar_y_Asignar_SizeRaya((byte)Integer.parseInt(String.valueOf(vista.jS_Raya.getValue())));
            vista.jS_Raya.setValue(conectarRaya.sizeRaya);            
        });
    }
        
//Eventos Mouse del tablero
    private void tablero_MouseMotion(){
        vista.jPTablero1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            
            @Override
            public void mouseMoved(MouseEvent me) {
               vista.jPTiro1.cambiarPosicion(me.getX(),conectarRaya.objTablero.getColumnas());
            }
        });
    }
    
    private void tablero_Mouse(){
        vista.jPTablero1.addMouseListener(new java.awt.event.MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent me) {
                
                if( conectarRaya.enCurso && (vista.jPTablero1.animacion.isRunning())==false && conectarRaya.verificar_Y_tirar(me.getX(), vista.jPTablero1.getWidth()) ){
                    
                    vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
                    
                    if(conectarRaya.hayGanador()){
                        actualizarEstadistica();
                        conectarRaya.resaltarCombinacionGanadora();
                        vista.jPTablero1.actualizarVistaTablero(conectarRaya.objTablero);
                        conectarRaya.detener();                        
                        try {
                            bd.agregarVictoria(vista.jTF_TurnoA.getText());                            
                        } catch (Exception ex) {
                            Logger.getLogger(C_IUConectarRaya.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(vista, "Ganador:\n"+vista.jTF_TurnoA.getText());
                        vista.jB_Iniciar.setText("Reiniciar");
                        actualizarPodio();
                    }else if(conectarRaya.totalTiros == conectarRaya.maxTiros){
                        conectarRaya.enCurso = false;
                        actualizarEstadistica();
                        JOptionPane.showMessageDialog(vista, "Empate");
                        vista.jB_Iniciar.setText("Reiniciar");
                    }else{
                        conectarRaya.cambiarTurno();
                        actualizarEstadistica();
                    }
                }
                            
            }
        });
    }

    /*
    private void pestanas_MouseListener() {
        vista.jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(vista.jTabbedPane1.getSelectedIndex()==1){
                    //actualizarTablaUsuarios();
                }
            }
        });
    }*/
}