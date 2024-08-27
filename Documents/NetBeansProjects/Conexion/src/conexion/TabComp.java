/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class TabComp extends javax.swing.JInternalFrame {
private CONEXIONN conn;
    /**
     * Creates new form TabComp
     */
    public TabComp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Usuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Cli = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comprobado.png"))); // NOI18N
        jLabel1.setText("comprobante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        btn_Usuario.setBackground(new java.awt.Color(0, 153, 153));
        btn_Usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carga-en-la-nube.png"))); // NOI18N
        btn_Usuario.setText("CARGAR DATOS");
        btn_Usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        table_Cli.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_Cli);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 345, 190));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButton1.setText("ACTUALIZAR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuarioActionPerformed
        // TODO add your handling code here:
        conn =new CONEXIONN();
        CargarDatos();
    }//GEN-LAST:event_btn_UsuarioActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed
public void CargarDatos(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("Tipo Comprobante");
        model.addColumn("Codigo de Venta");
       
        
        ResultSet rs=conn.ObtenerDatos("SELECT CodCom,TipCom,CodVen FROM comprobante");
        try{
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("CodCom"),
                rs.getString("NomCli"),
                rs.getString("CodVen"),
                
            });
            }
             table_Cli.setModel(model);
        }catch(SQLException ex){
           ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Usuario;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Cli;
    // End of variables declaration//GEN-END:variables
}
