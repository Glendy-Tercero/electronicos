/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.CompraModel;
import ventaelectronico.view.InsertarCompra;
import ventaelectronico.view.MenuPrincipal;


public class CompraCtrl {

public CompraCtrl() {}

private CompraModel modeloCom;
private MenuPrincipal vistaMenuPrin;
private InsertarCompra vistaInserCom;

public CompraCtrl(CompraModel model, MenuPrincipal view) {
    this.modeloCom = model;
    this.vistaMenuPrin = view;
}
public CompraCtrl(CompraModel model, InsertarCompra view) {
    this.modeloCom = model;
    this.vistaInserCom = view;
}

public String InsertarCompra(String fecha, int idProveedor, double total) {
    modeloCom = new CompraModel();
    modeloCom.setFecha(fecha);
    modeloCom.setIdProveedor(idProveedor);
    modeloCom.setTotal(total);
        
    String mensaje = modeloCom.InsertarCompra(modeloCom);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}
