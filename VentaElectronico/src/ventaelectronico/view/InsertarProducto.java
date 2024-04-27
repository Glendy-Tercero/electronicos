/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventaelectronico.view;

import javax.swing.JOptionPane;
import ventaelectronico.controller.ProductoCtrl;
import ventaelectronico.controller.ProveedorProductoCtrl;

public class InsertarProducto extends javax.swing.JFrame {
    
private ProductoCtrl controladorProd;
private ProveedorProductoCtrl controladorProvProd;

    public InsertarProducto() {
        initComponents();
    }

    InsertarProducto(ProductoCtrl CtrlProducto, ProveedorProductoCtrl CtrlProveedorProducto) {
        initComponents();
        controladorProd = CtrlProducto;
        controladorProvProd = CtrlProveedorProducto;
    }

    public void SetVistaMenu (ProductoCtrl CtrlProducto, ProveedorProductoCtrl CtrlProveedorProducto) {
        initComponents();
        controladorProd = CtrlProducto;
        controladorProvProd = CtrlProveedorProducto;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtExistencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtIDProveedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtIDProducto = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonGuardarProducto = new javax.swing.JButton();
        BotonGuardarID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 18, 29));

        TxtNombre.setBackground(new java.awt.Color(49, 52, 63));
        TxtNombre.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 252, 84));
        jLabel3.setText("Precio");

        TxtPrecio.setBackground(new java.awt.Color(49, 52, 63));
        TxtPrecio.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        TxtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 252, 84));
        jLabel4.setText("Existencia");

        TxtExistencia.setBackground(new java.awt.Color(49, 52, 63));
        TxtExistencia.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtExistencia.setForeground(new java.awt.Color(255, 255, 255));
        TxtExistencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 252, 84));
        jLabel5.setText("ID Proveedor");

        jPanel3.setBackground(new java.awt.Color(49, 52, 63));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar Producto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(554, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TxtIDProveedor.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDProveedor.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDProveedor.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 252, 84));
        jLabel1.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Bernard MT Condensed", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proveedor - Producto");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 252, 84));
        jLabel7.setText("ID Producto");

        TxtIDProducto.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDProducto.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        BotonRegresar.setBackground(new java.awt.Color(79, 84, 102));
        BotonRegresar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonRegresar.setForeground(new java.awt.Color(232, 255, 174));
        BotonRegresar.setText("Regresar");
        BotonRegresar.setToolTipText("");
        BotonRegresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        BotonBorrar.setBackground(new java.awt.Color(79, 84, 102));
        BotonBorrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(232, 255, 174));
        BotonBorrar.setText("Borrar");
        BotonBorrar.setToolTipText("");
        BotonBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        BotonGuardarProducto.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardarProducto.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardarProducto.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardarProducto.setText("Guardar Producto");
        BotonGuardarProducto.setToolTipText("");
        BotonGuardarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarProductoActionPerformed(evt);
            }
        });

        BotonGuardarID.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardarID.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardarID.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardarID.setText("Guardar ID's");
        BotonGuardarID.setToolTipText("");
        BotonGuardarID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardarID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGuardarID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        MenuPrincipal InsertarCompra = new MenuPrincipal();
        InsertarCompra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        this.TxtNombre.setText("");
        this.TxtPrecio.setText("");
        this.TxtExistencia.setText("");
        this.TxtIDProveedor.setText("");
        this.TxtIDProducto.setText("");
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarProductoActionPerformed
        String nombre, mensaje;
        int existencia;
        double precio;

        controladorProd = new ProductoCtrl();

        nombre = this.TxtNombre.getText();
        precio = Double.parseDouble(this.TxtPrecio.getText());
        existencia = Integer.parseInt(this.TxtExistencia.getText());
        mensaje = controladorProd.InsertarProducto(nombre, precio, existencia);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BotonGuardarProductoActionPerformed

    private void BotonGuardarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarIDActionPerformed
        String mensaje;
        int idProveedor, idProducto;

        controladorProvProd = new ProveedorProductoCtrl();

        idProveedor = Integer.parseInt(this.TxtIDProveedor.getText());
        idProducto = Integer.parseInt(this.TxtIDProducto.getText());
        mensaje = controladorProvProd.InsertarProveedorProducto(idProveedor, idProducto);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);

        MenuPrincipal principalMenu = new MenuPrincipal();
        this.dispose();
        principalMenu.setVisible(true);
    }//GEN-LAST:event_BotonGuardarIDActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonGuardarID;
    private javax.swing.JButton BotonGuardarProducto;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField TxtExistencia;
    private javax.swing.JTextField TxtIDProducto;
    private javax.swing.JTextField TxtIDProveedor;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
