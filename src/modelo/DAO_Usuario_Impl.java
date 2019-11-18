package modelo;

import interfaz.DAO_Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO_Usuario_Impl extends Conexion implements DAO_Usuario{
    
    private Statement st;
    private ResultSet rs;

    @Override
    public void insertar(String obj) throws Exception {
        try{
            conectar();
            st = conexion.createStatement();
            st.execute("INSERT INTO usuario(usuario_username, usuario_no_victorias) VALUES('"+obj+"',"+0+")");
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
    }

    @Override
    public void modificar(String obj, int id) throws Exception {
        try{
            conectar();
            st = conexion.createStatement();
            st.execute("UPDATE usuario SET "
                + "usuario_username='"+obj+"' "
                + "WHERE usuario_id="+id);
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
    }

    @Override
    public Object[][] listar() throws Exception {
        ArrayList<Usuario> aux = new ArrayList<>();
        Object[][] resultado = null;
        try{            
            conectar();
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM usuario");
            
            while(rs.next()){
                aux.add(new Usuario(rs.getInt(1), rs.getInt(3), rs.getString(2)));
            }
            st.close();
            rs.close();
            if(aux.size()>0){
                 resultado = new Object[aux.size()][2];
                 for (int i = 0; i < aux.size(); i++) {
                    resultado [i][0] = aux.get(i).getId();
                    resultado [i][1] = aux.get(i).getName();
                }
            }
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
        return resultado;
    }

    @Override
    public String[] listarXNombre() throws Exception {
        ArrayList<String> aux = new ArrayList<>();
        String[] resultado = null;
        try{            
            conectar();
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT usuario_username FROM usuario");
            
            while(rs.next()){
                aux.add(rs.getString(1));
            }
            st.close();
            rs.close();
            
            resultado = new String[aux.size()+1];
            resultado [0] = "Seleccione Jugador";
            for (int i = 0; i < aux.size(); i++) {
               resultado [i+1]= aux.get(i);
            }
            
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
        return resultado;
    }

    @Override
    public void agregarVictoria(String username) throws Exception {
        try{
            conectar();
            st = conexion.createStatement();
            st.execute("UPDATE usuario SET "
                + "usuario_no_victorias=(usuario_no_victorias+"+1+") "
                + "WHERE usuario_username='"+username+"'");
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
    }

    @Override
    public String[] listarNombreXvictorias(int victorias) throws Exception {
        
        ArrayList<String> aux = new ArrayList<>();
        String[] resultado = null;
        try{            
            conectar();
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT usuario_username FROM USUARIO WHERE usuario_no_victorias="+victorias);
            
            while(rs.next()){
                aux.add(rs.getString(1));
            }
            st.close();
            rs.close();
            
            resultado = new String[aux.size()];
            for (int i = 0; i < aux.size(); i++) {
               resultado [i]= aux.get(i);
            }
            
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
        return resultado;
    }
    
    @Override
    public int[] obtener3primerosPuntajes() throws Exception{
        int resultado [] = {0,0,0};
        try{            
            conectar();
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT usuario_no_victorias FROM USUARIO GROUP BY usuario_no_victorias ORDER BY usuario_no_victorias DESC FETCH FIRST 3 ROWS ONLY");
            
            byte i = 0;
            while(rs.next()){
                resultado[i] = rs.getInt(1);
                i++;
            }
            st.close();
            rs.close();
            
        }catch(Exception e){
            throw e;
        }finally{
            cerrar();
        }
        return resultado;
    }
 
}