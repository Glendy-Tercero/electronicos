/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventaelectronico.view;

import ventaelectronico.controller.ClienteCtrl;
import ventaelectronico.controller.CompraCtrl;
import ventaelectronico.controller.DetalleCompraCtrl;
import ventaelectronico.controller.DetalleVentaCtrl;
import ventaelectronico.controller.FacturaCtrl;
import ventaelectronico.controller.ProductoCtrl;
import ventaelectronico.controller.ProveedorCtrl;
import ventaelectronico.controller.ProveedorProductoCtrl;
import ventaelectronico.controller.VentaCtrl;

public class MenuPrincipal extends javax.swing.JFrame {
    
private ClienteCtrl controladorClien;
private ProveedorCtrl controladorProv;
private CompraCtrl controladorCom;
private VentaCtrl controladorVen;
private DetalleCompraCtrl controladorDetCom;
private DetalleVentaCtrl controladorDetVen;
private ProductoCtrl controladorProd;
private FacturaCtrl controladorFact;
private ProveedorProductoCtrl controladorProvProd;

    public MenuPrincipal() {
        initComponents();
    }

public void SetVistaMenu(ClienteCtrl CtrlCliente) {
    initComponents();
    controladorClien = CtrlCliente;
}

public void SetVistaMenu(ProveedorCtrl CtrlProveedor) {
    initComponents();
    controladorProv = CtrlProveedor;
}

public void SetVistaMenu(CompraCtrl CtrlCompra) {
    initComponents();
    controladorCom = CtrlCompra;
}

public void SetVistaMenu(VentaCtrl CtrlVenta) {
    initComponents();
    controladorVen = CtrlVenta;
}

public void SetVistaMenu(DetalleCompraCtrl CtrlDetalleCompra) {
    initComponents();
    controladorDetCom = CtrlDetalleCompra;
}

public void SetVistaMenu(DetalleVentaCtrl CtrlDetalleVenta) {
    initComponents();
    controladorDetVen = CtrlDetalleVenta;
}

public void SetVistaMenu(ProductoCtrl CtrlProducto) {
    initComponents();
    controladorProd = CtrlProducto;
}

public void SetVistaMenu(FacturaCtrl CtrlFactura) {
    initComponents();
    controladorFact = CtrlFactura;
}

public void SetVistaMenu(ProveedorProductoCtrl CtrlProveedorProducto) {
    initComponents();
    controladorProvProd = CtrlProveedorProducto;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonInsertarCliente = new javax.swing.JButton();
        BotonInsertarProveedor = new javax.swing.JButton();
        BotonInsertarVenta = new javax.swing.JButton();
        BotonInsertarCompra = new javax.swing.JButton();
        BotonInsertarFactura = new javax.swing.JButton();
        BotonInsertarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 18, 29));

        jPanel3.setBackground(new java.awt.Color(49, 52, 63));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Principal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(577, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("hacer?");

        BotonInsertarCliente.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarCliente.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarCliente.setText("Insertar Cliente");
        BotonInsertarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarClienteActionPerformed(evt);
            }
        });

        BotonInsertarProveedor.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarProveedor.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarProveedor.setText("Insertar Proveedor");
        BotonInsertarProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarProveedorActionPerformed(evt);
            }
        });

        BotonInsertarVenta.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarVenta.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarVenta.setText("Insertar Venta");
        BotonInsertarVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarVentaActionPerformed(evt);
            }
        });

        BotonInsertarCompra.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarCompra.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarCompra.setText("Insertar Compra");
        BotonInsertarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarCompraActionPerformed(evt);
            }
        });

        BotonInsertarFactura.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarFactura.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarFactura.setText("Insertar Factura");
        BotonInsertarFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarFacturaActionPerformed(evt);
            }
        });

        BotonInsertarProducto.setBackground(new java.awt.Color(204, 252, 84));
        BotonInsertarProducto.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        BotonInsertarProducto.setText("Insertar Producto");
        BotonInsertarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102), 2));
        BotonInsertarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarProductoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¿Qué desea");

        BotonSalir.setBackground(new java.awt.Color(79, 84, 102));
        BotonSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(232, 255, 174));
        BotonSalir.setText("Salir");
        BotonSalir.setToolTipText("");
        BotonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonInsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonInsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonInsertarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BotonInsertarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonInsertarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(195, 195, 195)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BotonInsertarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotonInsertarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BotonInsertarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BotonInsertarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BotonInsertarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonInsertarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195)))
                        .addGap(29, 29, 29)))
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BotonInsertarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarClienteActionPerformed
        InsertarCliente MenuInsertar = new InsertarCliente(controladorClien);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarClienteActionPerformed

    private void BotonInsertarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarProveedorActionPerformed
        InsertarProveedor MenuInsertar = new InsertarProveedor(controladorProv);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarProveedorActionPerformed

    private void BotonInsertarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarVentaActionPerformed
        InsertarVenta MenuInsertar = new InsertarVenta(controladorVen, controladorDetVen);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarVentaActionPerformed

    private void BotonInsertarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarCompraActionPerformed
        InsertarCompra MenuInsertar = new InsertarCompra(controladorCom, controladorDetCom);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarCompraActionPerformed

    private void BotonInsertarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarFacturaActionPerformed
        InsertarFactura MenuInsertar = new InsertarFactura(controladorFact);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarFacturaActionPerformed

    private void BotonInsertarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarProductoActionPerformed
        InsertarProducto MenuInsertar = new InsertarProducto(controladorProd, controladorProvProd);
        MenuInsertar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInsertarProductoActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInsertarCliente;
    private javax.swing.JButton BotonInsertarCompra;
    private javax.swing.JButton BotonInsertarFactura;
    private javax.swing.JButton BotonInsertarProducto;
    private javax.swing.JButton BotonInsertarProveedor;
    private javax.swing.JButton BotonInsertarVenta;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
