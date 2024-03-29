/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author jnava
 */
public class IUConectarRaya extends javax.swing.JFrame {

    /**
     * Creates new form IUConectarRaya
     */
    public IUConectarRaya() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPTiro1 = new vista.JPTiro();
        jPTablero1 = new vista.JPTablero();
        jB_Salir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jCB_1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCB_2 = new javax.swing.JComboBox<>();
        jB_Iniciar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jL_TotalTiros = new javax.swing.JLabel();
        jTF_TurnoA = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jS_Fila = new javax.swing.JSpinner();
        jS_Columna = new javax.swing.JSpinner();
        jS_Raya = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JPanel3 = new javax.swing.JPanel();
        jTF_username = new javax.swing.JTextField();
        jB_Agregar = new javax.swing.JButton();
        jB_Modificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTB_Bronce = new javax.swing.JToggleButton();
        jTB_Oro = new javax.swing.JToggleButton();
        jTB_Plata = new javax.swing.JToggleButton();
        jL_Podio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList_Podio = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conectar Raya");

        javax.swing.GroupLayout jPTiro1Layout = new javax.swing.GroupLayout(jPTiro1);
        jPTiro1.setLayout(jPTiro1Layout);
        jPTiro1Layout.setHorizontalGroup(
            jPTiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jPTiro1Layout.setVerticalGroup(
            jPTiro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPTablero1Layout = new javax.swing.GroupLayout(jPTablero1);
        jPTablero1.setLayout(jPTablero1Layout);
        jPTablero1Layout.setHorizontalGroup(
            jPTablero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        jPTablero1Layout.setVerticalGroup(
            jPTablero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jB_Salir.setBackground(java.awt.Color.white);
        jB_Salir.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jB_Salir.setForeground(java.awt.Color.red);
        jB_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/delete.png"))); // NOI18N
        jB_Salir.setText("Salir");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(java.awt.Color.white);

        jCB_1.setBackground(java.awt.Color.red);
        jCB_1.setFont(new java.awt.Font("Cantarell", 2, 18)); // NOI18N
        jCB_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VS");

        jCB_2.setBackground(java.awt.Color.yellow);
        jCB_2.setFont(new java.awt.Font("Cantarell", 2, 18)); // NOI18N
        jCB_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        jB_Iniciar.setBackground(java.awt.Color.white);
        jB_Iniciar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jB_Iniciar.setText("Iniciar Partida");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setText("Turno Actual:");

        jLabel6.setText("Total Tiros:");

        jL_TotalTiros.setText("...");

        jTF_TurnoA.setEditable(false);
        jTF_TurnoA.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jTF_TurnoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTF_TurnoA.setText("...");

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jS_Fila.setValue(6);

        jS_Columna.setValue(7);

        jS_Raya.setValue(4);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("No. Filas :");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No. Columnas :");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tamaño Raya :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jS_Columna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jS_Fila, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jS_Raya))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jS_Fila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jS_Columna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jS_Raya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCB_1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCB_2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jB_Iniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTF_TurnoA)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jL_TotalTiros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCB_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTF_TurnoA, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jL_TotalTiros))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Juego", jPanel2);

        jB_Agregar.setText("Añadir");

        jB_Modificar.setText("Modificar");

        jLabel7.setText("Ingrese o Modifique Jugador:");

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableUsuario);
        if (jTableUsuario.getColumnModel().getColumnCount() > 0) {
            jTableUsuario.getColumnModel().getColumn(0).setMinWidth(0);
            jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTableUsuario.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Podio"));

        buttonGroup1.add(jTB_Bronce);
        jTB_Bronce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/bronce.fw.png"))); // NOI18N

        buttonGroup1.add(jTB_Oro);
        jTB_Oro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/oro.fw.png"))); // NOI18N
        jTB_Oro.setSelected(true);

        buttonGroup1.add(jTB_Plata);
        jTB_Plata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recurso/plata.fw.png"))); // NOI18N

        jL_Podio.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jL_Podio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Podio.setText("...");

        jScrollPane1.setViewportView(jList_Podio);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Podio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTB_Plata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB_Oro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTB_Bronce, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTB_Bronce)
                    .addComponent(jTB_Oro)
                    .addComponent(jTB_Plata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Podio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout JPanel3Layout = new javax.swing.GroupLayout(JPanel3);
        JPanel3.setLayout(JPanel3Layout);
        JPanel3Layout.setHorizontalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_username)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel3Layout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jB_Modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(JPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPanel3Layout.setVerticalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Agregar)
                    .addComponent(jB_Modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Jugadores", JPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPTiro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPTablero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jB_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPTiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPTablero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel3;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JButton jB_Agregar;
    public javax.swing.JButton jB_Iniciar;
    public javax.swing.JButton jB_Modificar;
    public javax.swing.JButton jB_Salir;
    public javax.swing.JComboBox<String> jCB_1;
    public javax.swing.JComboBox<String> jCB_2;
    public javax.swing.JLabel jL_Podio;
    public javax.swing.JLabel jL_TotalTiros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JList<String> jList_Podio;
    public vista.JPTablero jPTablero1;
    public vista.JPTiro jPTiro1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JSpinner jS_Columna;
    public javax.swing.JSpinner jS_Fila;
    public javax.swing.JSpinner jS_Raya;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JToggleButton jTB_Bronce;
    public javax.swing.JToggleButton jTB_Oro;
    public javax.swing.JToggleButton jTB_Plata;
    public javax.swing.JTextField jTF_TurnoA;
    public javax.swing.JTextField jTF_username;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTableUsuario;
    // End of variables declaration//GEN-END:variables
}
