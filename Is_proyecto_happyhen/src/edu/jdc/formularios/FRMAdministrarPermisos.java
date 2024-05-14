
package edu.jdc.formularios;


public class FrmAdministrarPermisos extends javax.swing.JInternalFrame {

    private String[] textoColumnas = {"Codigo", "Nombre", "Funcionalidad", "Actualizar", "Borrar"};
    private DaoPermiso objMiDao;
    private List<Permisos> arregloPermisos;
    private Permisos objPermiso;

    private DefaultTableModel miModelito = new DefaultTableModel(textoColumnas, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {

            return false;

        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 3) {
                return ImageIcon.class;
            }

            if (columnIndex == 4) {
                return ImageIcon.class;
            }

            return Object.class;
        }

    };

    public FrmAdministrarPermisos() {
        initComponents();
      

        objMiDao = new DaoPermiso();
        arregloPermisos = new ArrayList<>();
        tablaSalida.setModel(miModelito);
          llenarTabla();

    }

    private void llenarTabla() {
        arregloPermisos = objMiDao.consultar("");

        String nombreActualizar = "/edu/jdc/imagines/editar.png";
        String nombreBorrar = "/edu/jdc/imagines/borrar.png";

        String rutaImagenActu = this.getClass().getResource(nombreActualizar).getPath();
        String rutaImagenborr = this.getClass().getResource(nombreBorrar).getPath();

        ImageIcon iconoActualizar = new ImageIcon(rutaImagenActu);
        ImageIcon iconoBorrar = new ImageIcon(rutaImagenborr);

        for (Permisos objMiPermiso : arregloPermisos) {
            Object[] miFila = new Object[5];

            miFila[0] = objMiPermiso.getCodePermiso();
            miFila[1] = objMiPermiso.getNombrePermiso();
            miFila[2] = objMiPermiso.getFuncionalidadPermiso();
            miFila[3] = iconoActualizar;
            miFila[4] = iconoBorrar;

            miModelito.addRow(miFila);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSalida = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        PanelNombrePermiso = new javax.swing.JPanel();
        lbNombrePermiso = new javax.swing.JLabel();
        cajaNombrePermiso = new javax.swing.JTextField();
        panelPersonalidadPermiso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cajaFuncionalidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        PanelTitulo.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("ADMINISTRAR PERMISOS");

        javax.swing.GroupLayout PanelTituloLayout = new javax.swing.GroupLayout(PanelTitulo);
        PanelTitulo.setLayout(PanelTituloLayout);
        PanelTituloLayout.setHorizontalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(191, 191, 191))
        );
        PanelTituloLayout.setVerticalGroup(
            PanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTituloLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 204));

        tablaSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaSalida);

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbNombrePermiso.setText("Nombre Permiso");

        javax.swing.GroupLayout PanelNombrePermisoLayout = new javax.swing.GroupLayout(PanelNombrePermiso);
        PanelNombrePermiso.setLayout(PanelNombrePermisoLayout);
        PanelNombrePermisoLayout.setHorizontalGroup(
            PanelNombrePermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNombrePermisoLayout.createSequentialGroup()
                .addComponent(lbNombrePermiso)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNombrePermisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cajaNombrePermiso)
                .addContainerGap())
        );
        PanelNombrePermisoLayout.setVerticalGroup(
            PanelNombrePermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNombrePermisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNombrePermiso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaNombrePermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel2.setText("Funcionalidad permiso");

        javax.swing.GroupLayout panelPersonalidadPermisoLayout = new javax.swing.GroupLayout(panelPersonalidadPermiso);
        panelPersonalidadPermiso.setLayout(panelPersonalidadPermisoLayout);
        panelPersonalidadPermisoLayout.setHorizontalGroup(
            panelPersonalidadPermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalidadPermisoLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(cajaFuncionalidad)
        );
        panelPersonalidadPermisoLayout.setVerticalGroup(
            panelPersonalidadPermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalidadPermisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaFuncionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 51, 255));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelNombrePermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPersonalidadPermiso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))))
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(369, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(PanelNombrePermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPersonalidadPermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btnCancelar)))
                .addGap(93, 93, 93))
            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalLayout.createSequentialGroup()
                    .addContainerGap(283, Short.MAX_VALUE)
                    .addComponent(btnActualizar)
                    .addGap(133, 133, 133)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         

         int opcion=0;
    
    String[] textoBotones={"Aceptar","Cancelar"};
    
    opcion=JOptionPane.showOptionDialog(PanelPrincipal,
            "estas seguro",
            "cerrar aplicacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,textoBotones,textoBotones[1]);
    
            if(opcion==JOptionPane.YES_NO_OPTION){
            System.exit(0);
            }
            
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JPanel PanelNombrePermiso;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTitulo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField cajaFuncionalidad;
    private javax.swing.JTextField cajaNombrePermiso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNombrePermiso;
    private javax.swing.JPanel panelPersonalidadPermiso;
    private javax.swing.JTable tablaSalida;
    // End of variables declaration                   
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

