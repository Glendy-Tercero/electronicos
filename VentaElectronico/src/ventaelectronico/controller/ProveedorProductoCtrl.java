/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.ProveedorProductoModel;
import ventaelectronico.view.InsertarProducto;
import ventaelectronico.view.MenuPrincipal;

public class ProveedorProductoCtrl {
 
public ProveedorProductoCtrl() {}    
    
private ProveedorProductoModel modeloProvProd;
private MenuPrincipal vistaMenuPrin;
private InsertarProducto vistaInserProvProd;

public ProveedorProductoCtrl(ProveedorProductoModel model, MenuPrincipal view) {
    this.modeloProvProd = model;
    this.vistaMenuPrin = view;
}
public ProveedorProductoCtrl(ProveedorProductoModel model, InsertarProducto view) {
    this.modeloProvProd = model;
    this.vistaInserProvProd = view;
}

public String InsertarProveedorProducto(int idProveedor, int idProducto) {
    modeloProvProd = new ProveedorProductoModel();
    modeloProvProd.setIdProveedor(idProveedor);
    modeloProvProd.setIdProducto(idProducto);
        
    String mensaje = modeloProvProd.InsertarProveedorProducto(modeloProvProd);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}

}
