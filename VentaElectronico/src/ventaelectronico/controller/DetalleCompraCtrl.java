/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.DetalleCompraModel;
import ventaelectronico.view.InsertarCompra;
import ventaelectronico.view.MenuPrincipal;

public class DetalleCompraCtrl {

public DetalleCompraCtrl() {}

private DetalleCompraModel modeloDetaCom;
private MenuPrincipal vistaMenuPrin;
private InsertarCompra vistaInserCom;

public DetalleCompraCtrl(DetalleCompraModel model, MenuPrincipal view) {
    this.modeloDetaCom = model;
    this.vistaMenuPrin = view;
}
public DetalleCompraCtrl(DetalleCompraModel model, InsertarCompra view) {
    this.modeloDetaCom = model;
    this.vistaInserCom = view;
}

public String InsertarDetalleCompra(int idCompra, int idProducto, int cantidad, double precioUnitario, double total) {
    modeloDetaCom = new DetalleCompraModel();
    modeloDetaCom.setIdCompra(idCompra);
    modeloDetaCom.setIdProducto(idProducto);
    modeloDetaCom.setCantidad(cantidad);
    modeloDetaCom.setPrecioUnitario(precioUnitario);
    modeloDetaCom.setTotal(total);
        
    String mensaje = modeloDetaCom.InsertarDetalleCompra(modeloDetaCom);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}

