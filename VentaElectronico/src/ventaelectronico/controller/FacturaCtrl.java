/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.FacturaModel;
import ventaelectronico.view.InsertarFactura;
import ventaelectronico.view.MenuPrincipal;

public class FacturaCtrl {

public FacturaCtrl() {}

private FacturaModel modeloFact;
private MenuPrincipal vistaMenuPrin;
private InsertarFactura vistaInserFact;

public FacturaCtrl(FacturaModel model, MenuPrincipal view) {
    this.modeloFact = model;
    this.vistaMenuPrin = view;
}
public FacturaCtrl(FacturaModel model, InsertarFactura view) {
    this.modeloFact = model;
    this.vistaInserFact = view;
}

public String InsertarFactura(String fecha, int idVenta, double total) {
    modeloFact = new FacturaModel();
    modeloFact.setFecha(fecha);    
    modeloFact.setIdVenta(idVenta);
    modeloFact.setTotal(total);
        
    String mensaje = modeloFact.InsertarFactura(modeloFact);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}

}
   
