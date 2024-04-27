/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventaelectronico.view;

import javax.swing.JOptionPane;
import ventaelectronico.controller.CompraCtrl;
import ventaelectronico.controller.DetalleCompraCtrl;


public class InsertarCompra extends javax.swing.JFrame {

private CompraCtrl controladorCom;
private DetalleCompraCtrl controladorDetCom;

    public InsertarCompra() {
        initComponents();
    }

    InsertarCompra(CompraCtrl CtrlCompra, DetalleCompraCtrl CtrlDetalleCompra) {
        initComponents();
        controladorCom = CtrlCompra;
        controladorDetCom = CtrlDetalleCompra;
    }

    public void SetVistaMenu (CompraCtrl CtrlCompra, DetalleCompraCtrl CtrlDetalleCompra) {
        initComponents();
        controladorCom = CtrlCompra;
        controladorDetCom = CtrlDetalleCompra;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtIDProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardarDetalle = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtIDCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtPrecioUnitario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtIDProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        BotonBorrar = new javax.swing.JButton();
        BotonGuardarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 18, 29));

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

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 252, 84));
        jLabel1.setText("ID Proveedor");

        TxtIDProveedor.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDProveedor.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDProveedor.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 252, 84));
        jLabel3.setText("Fecha");

        TxtFecha.setBackground(new java.awt.Color(49, 52, 63));
        TxtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtFecha.setForeground(new java.awt.Color(255, 255, 255));
        TxtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 252, 84));
        jLabel4.setText("Total");

        TxtTotal.setBackground(new java.awt.Color(49, 52, 63));
        TxtTotal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jPanel3.setBackground(new java.awt.Color(49, 52, 63));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar Compra");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        BotonGuardarDetalle.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardarDetalle.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardarDetalle.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardarDetalle.setText("Guardar Detalles");
        BotonGuardarDetalle.setToolTipText("");
        BotonGuardarDetalle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardarDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarDetalleActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalles");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 252, 84));
        jLabel6.setText("ID Compra");

        TxtIDCompra.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDCompra.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDCompra.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 252, 84));
        jLabel8.setText("Precio Unitario");

        TxtPrecioUnitario.setBackground(new java.awt.Color(49, 52, 63));
        TxtPrecioUnitario.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtPrecioUnitario.setForeground(new java.awt.Color(255, 255, 255));
        TxtPrecioUnitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 252, 84));
        jLabel9.setText("ID Producto");

        TxtIDProducto.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDProducto.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 252, 84));
        jLabel10.setText("Cantidad");

        TxtCantidad.setBackground(new java.awt.Color(49, 52, 63));
        TxtCantidad.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        TxtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

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

        BotonGuardarCompra.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardarCompra.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardarCompra.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardarCompra.setText("Guardar Compra");
        BotonGuardarCompra.setToolTipText("");
        BotonGuardarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGuardarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(TxtIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(TxtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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

    private void BotonGuardarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarDetalleActionPerformed
    String mensaje;
    int idCompra, idProducto, cantidad;
    double precioUnitario, total;
    
        controladorDetCom = new DetalleCompraCtrl();

        idCompra = Integer.parseInt(this.TxtIDCompra.getText());
        idProducto = Integer.parseInt(this.TxtIDProducto.getText());
        cantidad = Integer.parseInt(this.TxtCantidad.getText());
        precioUnitario = Double.parseDouble(this.TxtPrecioUnitario.getText());
        total = Double.parseDouble(this.TxtTotal.getText());
        mensaje = controladorDetCom.InsertarDetalleCompra(idCompra, idProducto, cantidad, precioUnitario, total);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
        
        MenuPrincipal principalMenu = new MenuPrincipal();
        this.dispose();
        principalMenu.setVisible(true);   
    }//GEN-LAST:event_BotonGuardarDetalleActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        this.TxtFecha.setText("");
        this.TxtIDProveedor.setText("");
        this.TxtTotal.setText("");
        this.TxtIDCompra.setText("");
        this.TxtIDProducto.setText("");
        this.TxtPrecioUnitario.setText("");
        this.TxtCantidad.setText("");
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        MenuPrincipal InsertarCompra = new MenuPrincipal();
        InsertarCompra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonGuardarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarCompraActionPerformed
    String fecha, mensaje;
    int idProveedor;
    double total;
    
        controladorCom = new CompraCtrl();

        fecha = this.TxtFecha.getText();
        idProveedor = Integer.parseInt(this.TxtIDProveedor.getText());
        total = Double.parseDouble(this.TxtTotal.getText());
        mensaje = controladorCom.InsertarCompra(fecha, idProveedor, total);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonGuardarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonGuardarCompra;
    private javax.swing.JButton BotonGuardarDetalle;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtIDCompra;
    private javax.swing.JTextField TxtIDProducto;
    private javax.swing.JTextField TxtIDProveedor;
    private javax.swing.JTextField TxtPrecioUnitario;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
