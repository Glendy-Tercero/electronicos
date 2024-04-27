/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventaelectronico.view;

import javax.swing.JOptionPane;
import ventaelectronico.controller.DetalleVentaCtrl;
import ventaelectronico.controller.VentaCtrl;

public class InsertarVenta extends javax.swing.JFrame {

private VentaCtrl controladorVen;
private DetalleVentaCtrl controladorDetVen;

    public InsertarVenta() {
        initComponents();
    }

    InsertarVenta(VentaCtrl CtrlVenta, DetalleVentaCtrl CtrlDetalleVenta) {
        initComponents();
        controladorVen = CtrlVenta;
        controladorDetVen = CtrlDetalleVenta;
    }

    public void SetVistaMenu (VentaCtrl CtrlVenta, DetalleVentaCtrl CtrlDetalleVenta) {
        initComponents();
        controladorVen = CtrlVenta;
        controladorDetVen = CtrlDetalleVenta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtIDVenta = new javax.swing.JTextField();
        TxtIDCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtPrecioUnitario = new javax.swing.JTextField();
        TxtFecha = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtIDProducto = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TxtCantidad = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonGuardarVenta = new javax.swing.JButton();
        BotonGuardarDetalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 18, 29));

        jLabel7.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Detalles");

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 252, 84));
        jLabel6.setText("ID Venta");

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 252, 84));
        jLabel1.setText("ID Cliente");

        TxtIDVenta.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDVenta.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDVenta.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        TxtIDCliente.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDCliente.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDCliente.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 252, 84));
        jLabel8.setText("Precio Unitario");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 252, 84));
        jLabel3.setText("Fecha");

        TxtPrecioUnitario.setBackground(new java.awt.Color(49, 52, 63));
        TxtPrecioUnitario.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtPrecioUnitario.setForeground(new java.awt.Color(255, 255, 255));
        TxtPrecioUnitario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        TxtFecha.setBackground(new java.awt.Color(49, 52, 63));
        TxtFecha.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtFecha.setForeground(new java.awt.Color(255, 255, 255));
        TxtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 252, 84));
        jLabel9.setText("ID Producto");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 252, 84));
        jLabel4.setText("Total");

        TxtIDProducto.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDProducto.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDProducto.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        TxtTotal.setBackground(new java.awt.Color(49, 52, 63));
        TxtTotal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 252, 84));
        jLabel10.setText("Cantidad");

        jPanel3.setBackground(new java.awt.Color(49, 52, 63));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar Venta");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        TxtCantidad.setBackground(new java.awt.Color(49, 52, 63));
        TxtCantidad.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        TxtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

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

        BotonGuardarVenta.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardarVenta.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardarVenta.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardarVenta.setText("Guardar Venta");
        BotonGuardarVenta.setToolTipText("");
        BotonGuardarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarVentaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(TxtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(TxtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonGuardarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
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
                        .addComponent(TxtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(TxtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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
        MenuPrincipal InsertarVenta = new MenuPrincipal();
        InsertarVenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        this.TxtFecha.setText("");
        this.TxtIDCliente.setText("");
        this.TxtTotal.setText("");
        this.TxtIDVenta.setText("");
        this.TxtIDProducto.setText("");
        this.TxtPrecioUnitario.setText("");
        this.TxtCantidad.setText("");
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarVentaActionPerformed
        String fecha, mensaje;
        int idCliente;
        double total;

        controladorVen = new VentaCtrl();

        fecha = this.TxtFecha.getText();
        idCliente = Integer.parseInt(this.TxtIDCliente.getText());
        total = Double.parseDouble(this.TxtTotal.getText());
        mensaje = controladorVen.InsertarVenta(fecha, idCliente, total);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BotonGuardarVentaActionPerformed

    private void BotonGuardarDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarDetalleActionPerformed
        String mensaje;
        int idVenta, idProducto, cantidad;
        double precioUnitario, total;

        controladorDetVen = new DetalleVentaCtrl();

        idVenta = Integer.parseInt(this.TxtIDVenta.getText());
        idProducto = Integer.parseInt(this.TxtIDProducto.getText());
        cantidad = Integer.parseInt(this.TxtCantidad.getText());
        precioUnitario = Double.parseDouble(this.TxtPrecioUnitario.getText());
        total = Double.parseDouble(this.TxtTotal.getText());
        mensaje = controladorDetVen.InsertarDetalleVenta(idVenta, idProducto, cantidad, precioUnitario, total);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);

        MenuPrincipal principalMenu = new MenuPrincipal();
        this.dispose();
        principalMenu.setVisible(true);
    }//GEN-LAST:event_BotonGuardarDetalleActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonGuardarDetalle;
    private javax.swing.JButton BotonGuardarVenta;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField TxtCantidad;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtIDCliente;
    private javax.swing.JTextField TxtIDProducto;
    private javax.swing.JTextField TxtIDVenta;
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
