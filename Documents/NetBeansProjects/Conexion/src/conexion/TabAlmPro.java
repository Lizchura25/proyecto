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
public class TabAlmPro extends javax.swing.JInternalFrame {
private CONEXIONN conn;
    /**
     * Creates new form TabAlmPro
     */
    public TabAlmPro() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Cli = new javax.swing.JTable();
        btn_Usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        btn_Usuario.setText("CARGAR DATOS");
        btn_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("almacen de productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Usuario)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Usuario)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UsuarioActionPerformed
        // TODO add your handling code here:
        conn =new CONEXIONN();
        CargarDatos();
    }//GEN-LAST:event_btn_UsuarioActionPerformed
public void CargarDatos(){
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("CODIGO");
        model.addColumn("FECHA INICIO");
        model.addColumn("Fecha vencimiento");
        model.addColumn("CODIGO DISTRIBUIDOR");
        
        ResultSet rs=conn.ObtenerDatos("SELECT CodAlm,FeiAlm,FevAlm,CodDis FROM almacenproductos");
        try{
            while(rs.next()){
                model.addRow(new Object[]{
                rs.getString("CodAlm"),
                rs.getString("FeiAlm"),
                rs.getString("FevAlm"),
                rs.getString("CodDis"),
            });
            }
             table_Cli.setModel(model);
        }catch(SQLException ex){
           ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Cli;
    // End of variables declaration//GEN-END:variables
}
