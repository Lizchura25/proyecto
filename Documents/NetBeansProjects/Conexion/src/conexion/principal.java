/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import conexion.TabUsu;

/**
 *
 * @author HP
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
       //this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        Btn_Nuevo = new javax.swing.JButton();
        btn_Agre = new javax.swing.JButton();
        Btn_Imprimir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        NomPro = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        CantPro = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        PreTot = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1_Usuario = new javax.swing.JMenu();
        mostarUsu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MItm_AgreUsu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mostrarCli = new javax.swing.JMenuItem();
        AgreCli = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mostrarCat = new javax.swing.JMenuItem();
        AgreCat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mostrarProd = new javax.swing.JMenuItem();
        AgrePro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mostrarEmp = new javax.swing.JMenuItem();
        AgreEmp = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mostrarVen = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mostrarDv = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mostrarAlmp = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        mostrarDis = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo-producto.png"))); // NOI18N
        Btn_Nuevo.setText("NUEVO");
        Btn_Nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, -1));

        btn_Agre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comercio-electronico.png"))); // NOI18N
        btn_Agre.setText("AGREGAR");
        btn_Agre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btn_Agre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        Btn_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/impresora.png"))); // NOI18N
        Btn_Imprimir.setText("IMPRIMIR");
        Btn_Imprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(Btn_Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 204, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setText("NOMBRE DEL PRODUCTO:");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel1.add(NomPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 120, -1));

        jTextField3.setBackground(new java.awt.Color(255, 51, 0));
        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jTextField3.setText("LA CASERITA");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 30));

        jTextField4.setBackground(new java.awt.Color(255, 204, 153));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setText("CANTIDAD:");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        jPanel1.add(CantPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 70, -1));

        jTextField6.setBackground(new java.awt.Color(255, 204, 153));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setText("PRECIO:");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 70, -1));

        jTextField7.setBackground(new java.awt.Color(255, 204, 153));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setText("PRECIO TOTAL:");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));
        jPanel1.add(PreTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, -1));
        jPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajero (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 270, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portada,Miii.jpg"))); // NOI18N
        jLabel2.setText("NOMBRE DEL PRODUCTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1_Usuario.setText("usuarios");

        mostarUsu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajo-en-equipo.png"))); // NOI18N
        mostarUsu.setText("mostrar usuarios");
        mostarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostarUsuActionPerformed(evt);
            }
        });
        jMenu1_Usuario.add(mostarUsu);
        jMenu1_Usuario.add(jSeparator1);

        MItm_AgreUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        MItm_AgreUsu.setText("Agregar Usuario");
        MItm_AgreUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItm_AgreUsuActionPerformed(evt);
            }
        });
        jMenu1_Usuario.add(MItm_AgreUsu);

        jMenuBar1.add(jMenu1_Usuario);

        jMenu2.setText("cliente");

        mostrarCli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarCli.setText("mostrar cliente");
        mostrarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCliActionPerformed(evt);
            }
        });
        jMenu2.add(mostrarCli);

        AgreCli.setText("Agregar Cliente");
        AgreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreCliActionPerformed(evt);
            }
        });
        jMenu2.add(AgreCli);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("categoria");

        mostrarCat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarCat.setText("mostrar categoria");
        mostrarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarCatActionPerformed(evt);
            }
        });
        jMenu1.add(mostrarCat);

        AgreCat.setText("Agregar Categoria");
        AgreCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreCatActionPerformed(evt);
            }
        });
        jMenu1.add(AgreCat);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("producto");

        mostrarProd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarProd.setText("mostrar producto");
        mostrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarProdActionPerformed(evt);
            }
        });
        jMenu3.add(mostrarProd);

        AgrePro.setText("Agregar Producto");
        AgrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreProActionPerformed(evt);
            }
        });
        jMenu3.add(AgrePro);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("empleado");

        mostrarEmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarEmp.setText("mostrar empleado");
        mostrarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEmpActionPerformed(evt);
            }
        });
        jMenu4.add(mostrarEmp);

        AgreEmp.setText("Agregar empleado");
        AgreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreEmpActionPerformed(evt);
            }
        });
        jMenu4.add(AgreEmp);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("ventas");

        mostrarVen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarVen.setText("mostrar ventas");
        mostrarVen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarVenActionPerformed(evt);
            }
        });
        jMenu5.add(mostrarVen);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("detalle_venta");

        mostrarDv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarDv.setText("mostrar detalle_venta");
        mostrarDv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDvActionPerformed(evt);
            }
        });
        jMenu6.add(mostrarDv);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("almacen_productos");

        mostrarAlmp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarAlmp.setText("mostrar almacen_productos");
        mostrarAlmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAlmpActionPerformed(evt);
            }
        });
        jMenu7.add(mostrarAlmp);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("distribuidor");

        mostrarDis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.SHIFT_MASK));
        mostrarDis.setText("mostrar distribuidor");
        mostrarDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarDisActionPerformed(evt);
            }
        });
        jMenu8.add(mostrarDis);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCatActionPerformed
        // TODO add your handling code here:
        TabCat Mostrarcat = new TabCat();
        escritorio.add(Mostrarcat);
        Mostrarcat.show();
    }//GEN-LAST:event_mostrarCatActionPerformed

    private void mostrarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarCliActionPerformed
        // TODO add your handling code here:
        TabCli MostrarCli = new TabCli();
        escritorio.add(MostrarCli);
        MostrarCli.show();
    }//GEN-LAST:event_mostrarCliActionPerformed

    private void mostrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarProdActionPerformed
        // TODO add your handling code here:
        TabPro MostrarPro = new TabPro();
        escritorio.add(MostrarPro);
        MostrarPro.show();
    }//GEN-LAST:event_mostrarProdActionPerformed

    private void mostrarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEmpActionPerformed
        // TODO add your handling code here:
        TabEmp MostrarEmp = new TabEmp();
        escritorio.add(MostrarEmp);
        MostrarEmp.show();
    }//GEN-LAST:event_mostrarEmpActionPerformed

    private void mostrarVenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarVenActionPerformed
        // TODO add your handling code here:
        TabVent MostrarVent = new TabVent();
        escritorio.add(MostrarVent);
        MostrarVent.show();
    }//GEN-LAST:event_mostrarVenActionPerformed

    private void mostrarDvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDvActionPerformed
        // TODO add your handling code here:
        TabDV MostrarDV = new TabDV();
        escritorio.add(MostrarDV);
        MostrarDV.show();
    }//GEN-LAST:event_mostrarDvActionPerformed

    private void mostrarAlmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAlmpActionPerformed
        // TODO add your handling code here:
        TabAlmPro MostrarAP = new TabAlmPro();
        escritorio.add(MostrarAP);
        MostrarAP.show();
    }//GEN-LAST:event_mostrarAlmpActionPerformed

    private void mostrarDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarDisActionPerformed
        // TODO add your handling code here:
        TabDis MostrarDis = new TabDis();
        escritorio.add(MostrarDis);
        MostrarDis.show();
    }//GEN-LAST:event_mostrarDisActionPerformed

    private void AgreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreCliActionPerformed
        // TODO add your handling code here:
        AgreCli AgregarCli = new AgreCli();
        escritorio.add(AgregarCli);
        AgregarCli.show();
        
    }//GEN-LAST:event_AgreCliActionPerformed

    private void AgreCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreCatActionPerformed
        // TODO add your handling code here:
        AgreCat AgregarCat = new AgreCat();
        escritorio.add(AgregarCat);
        AgregarCat.show();
    }//GEN-LAST:event_AgreCatActionPerformed

    private void AgreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreEmpActionPerformed
        // TODO add your handling code here:
        AgreEmp AgregarEmp = new AgreEmp();
        escritorio.add(AgregarEmp);
        AgregarEmp.show();
    }//GEN-LAST:event_AgreEmpActionPerformed

    private void AgreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreProActionPerformed
        // TODO add your handling code here:
        AgrePro AgregarPro = new AgrePro();
        escritorio.add(AgregarPro);
        AgregarPro.show();
    }//GEN-LAST:event_AgreProActionPerformed

    private void MItm_AgreUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItm_AgreUsuActionPerformed
        // TODO add your handling code here:
        AgreUsu AgregarUsu = new AgreUsu();
        escritorio.add(AgregarUsu);
        AgregarUsu.show();
    }//GEN-LAST:event_MItm_AgreUsuActionPerformed

    private void mostarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostarUsuActionPerformed
        // TODO add your handling code here:
        TabUsu MostrarUsu = new TabUsu();
        escritorio.add(MostrarUsu);
        MostrarUsu.show();
    }//GEN-LAST:event_mostarUsuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgreCat;
    private javax.swing.JMenuItem AgreCli;
    private javax.swing.JMenuItem AgreEmp;
    private javax.swing.JMenuItem AgrePro;
    private javax.swing.JButton Btn_Imprimir;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JTextField CantPro;
    private javax.swing.JMenuItem MItm_AgreUsu;
    private javax.swing.JTextField NomPro;
    private javax.swing.JTextField PreTot;
    private javax.swing.JButton btn_Agre;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu1_Usuario;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JMenuItem mostarUsu;
    private javax.swing.JMenuItem mostrarAlmp;
    private javax.swing.JMenuItem mostrarCat;
    private javax.swing.JMenuItem mostrarCli;
    private javax.swing.JMenuItem mostrarDis;
    private javax.swing.JMenuItem mostrarDv;
    private javax.swing.JMenuItem mostrarEmp;
    private javax.swing.JMenuItem mostrarProd;
    private javax.swing.JMenuItem mostrarVen;
    private javax.swing.JTextField precio;
    // End of variables declaration//GEN-END:variables
}
