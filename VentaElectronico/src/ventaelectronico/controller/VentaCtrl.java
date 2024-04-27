/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.VentaModel;
import ventaelectronico.view.InsertarVenta;
import ventaelectronico.view.MenuPrincipal;

public class VentaCtrl {

public VentaCtrl() {}

private VentaModel modeloVen;
private MenuPrincipal vistaMenuPrin;
private InsertarVenta vistaInserVen;

public VentaCtrl(VentaModel model, MenuPrincipal view) {
    this.modeloVen = model;
    this.vistaMenuPrin = view;
}
public VentaCtrl(VentaModel model, InsertarVenta view) {
    this.modeloVen = model;
    this.vistaInserVen = view;
}

public String InsertarVenta(String fecha, int idCliente, double total) {
    modeloVen = new VentaModel();
    modeloVen.setFecha(fecha);
    modeloVen.setIdCliente(idCliente);
    modeloVen.setTotal(total);
        
    String mensaje = modeloVen.InsertarVenta(modeloVen);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}
