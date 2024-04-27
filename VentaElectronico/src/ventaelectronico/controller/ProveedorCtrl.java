/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.ProveedorModel;
import ventaelectronico.view.InsertarProveedor;
import ventaelectronico.view.MenuPrincipal;

public class ProveedorCtrl {

public ProveedorCtrl() {}

private ProveedorModel modeloProv;
private MenuPrincipal vistaMenuPrin;
private InsertarProveedor vistaInserProve;


public ProveedorCtrl(ProveedorModel model, MenuPrincipal view) {
    this.modeloProv = model;
    this.vistaMenuPrin = view;
}
public ProveedorCtrl(ProveedorModel model, InsertarProveedor view) {
    this.modeloProv = model;
    this.vistaInserProve = view;
}

public String InsertarProveedor(String nombre, String direccion, String correo, int telefono) {
    modeloProv = new ProveedorModel();
    modeloProv.setNombre(nombre);
    modeloProv.setDireccion(direccion);
    modeloProv.setCorreo(correo);
    modeloProv.setTelefono(telefono);
        
    String mensaje = modeloProv.InsertarProveedor(modeloProv);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}

