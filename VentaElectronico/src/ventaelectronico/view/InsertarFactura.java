/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventaelectronico.view;

import javax.swing.JOptionPane;
import ventaelectronico.controller.FacturaCtrl;
import ventaelectronico.view.MenuPrincipal;

public class InsertarFactura extends javax.swing.JFrame {

private FacturaCtrl controladorFact;

    public InsertarFactura() {
        initComponents();
    }

    InsertarFactura (FacturaCtrl CtrlFactura) {
        initComponents();
        controladorFact = CtrlFactura;
    }

    public void SetVistaMenu (FacturaCtrl CtrlFactura) {
        initComponents();
        controladorFact = CtrlFactura;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtIDVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BotonBorrar = new javax.swing.JButton();
        TxtTotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        BotonRegresar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 18, 29));

        TxtIDVenta.setBackground(new java.awt.Color(49, 52, 63));
        TxtIDVenta.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtIDVenta.setForeground(new java.awt.Color(255, 255, 255));
        TxtIDVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

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

        TxtTotal.setBackground(new java.awt.Color(49, 52, 63));
        TxtTotal.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(255, 255, 255));
        TxtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 84, 102)));

        jPanel3.setBackground(new java.awt.Color(49, 52, 63));

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Insertar Factura");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        BotonGuardar.setBackground(new java.awt.Color(79, 84, 102));
        BotonGuardar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(232, 255, 174));
        BotonGuardar.setText("Guardar");
        BotonGuardar.setToolTipText("");
        BotonGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        BotonRegresar1.setBackground(new java.awt.Color(79, 84, 102));
        BotonRegresar1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BotonRegresar1.setForeground(new java.awt.Color(232, 255, 174));
        BotonRegresar1.setText("Regresar");
        BotonRegresar1.setToolTipText("");
        BotonRegresar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 255, 174)));
        BotonRegresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresar1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 252, 84));
        jLabel1.setText("ID Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BotonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TxtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
    String fecha, mensaje;
    int idVenta;
    double total;
    
        controladorFact = new FacturaCtrl();

        fecha = this.TxtFecha.getText();
        idVenta = Integer.parseInt(this.TxtIDVenta.getText());
        total = Double.parseDouble(this.TxtTotal.getText());
        mensaje = controladorFact.InsertarFactura(fecha, idVenta, total);
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
        
        MenuPrincipal principalMenu = new MenuPrincipal();
        this.dispose();
        principalMenu.setVisible(true);   
 
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        this.TxtFecha.setText("");        
        this.TxtIDVenta.setText("");
        this.TxtTotal.setText("");
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresar1ActionPerformed
        MenuPrincipal InsertarFactura = new MenuPrincipal();
        InsertarFactura.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar1;
    private javax.swing.JTextField TxtFecha;
    private javax.swing.JTextField TxtIDVenta;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
