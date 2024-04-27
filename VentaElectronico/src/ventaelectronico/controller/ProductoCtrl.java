/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.ProductoModel;
import ventaelectronico.view.InsertarProducto;
import ventaelectronico.view.MenuPrincipal;

public class ProductoCtrl {
 
public ProductoCtrl() {}

private ProductoModel modeloProd;
private MenuPrincipal vistaMenuPrin;
private InsertarProducto vistaInserProd;

public ProductoCtrl(ProductoModel model, MenuPrincipal view) {
    this.modeloProd = model;
    this.vistaMenuPrin = view;
}
public ProductoCtrl(ProductoModel model, InsertarProducto view) {
    this.modeloProd = model;
    this.vistaInserProd = view;
}

public String InsertarProducto(String nombre, double precio, int existencia) {
    modeloProd = new ProductoModel();
    modeloProd.setNombre(nombre);
    modeloProd.setPrecio(precio);
    modeloProd.setExistencia(existencia);
        
    String mensaje = modeloProd.InsertarProducto(modeloProd);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}

}