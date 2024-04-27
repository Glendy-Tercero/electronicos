/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.DetalleVentaModel;
import ventaelectronico.view.InsertarVenta;
import ventaelectronico.view.MenuPrincipal;

public class DetalleVentaCtrl {

public DetalleVentaCtrl() {}

private DetalleVentaModel modeloDetaVen;
private MenuPrincipal vistaMenuPrin;
private InsertarVenta vistaInserVen;

public DetalleVentaCtrl(DetalleVentaModel model, MenuPrincipal view) {
    this.modeloDetaVen = model;
    this.vistaMenuPrin = view;
}
public DetalleVentaCtrl(DetalleVentaModel model, InsertarVenta view) {
    this.modeloDetaVen = model;
    this.vistaInserVen = view;
}

public String InsertarDetalleVenta(int idVenta, int idProducto, int cantidad, double precioUnitario, double total) {
    modeloDetaVen = new DetalleVentaModel();
    modeloDetaVen.setIdVenta(idVenta);
    modeloDetaVen.setIdProducto(idProducto);
    modeloDetaVen.setCantidad(cantidad);
    modeloDetaVen.setPrecioUnitario(precioUnitario);
    modeloDetaVen.setTotal(total);
        
    String mensaje = modeloDetaVen.InsertarDetalleVenta(modeloDetaVen);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}

