/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.controller;

import ventaelectronico.model.ClienteModel;
import ventaelectronico.view.InsertarCliente;
import ventaelectronico.view.MenuPrincipal;


public class ClienteCtrl {

public ClienteCtrl() {}

private ClienteModel modeloClien;
private MenuPrincipal vistaMenuPrin;
private InsertarCliente vistaInserClien;


public ClienteCtrl(ClienteModel model, MenuPrincipal view) {
    this.modeloClien = model;
    this.vistaMenuPrin = view;
}
public ClienteCtrl(ClienteModel model, InsertarCliente view) {
    this.modeloClien = model;
    this.vistaInserClien = view;
}

public String InsertarCliente(String nombre, String nit, String correo, int telefono) {
    modeloClien = new ClienteModel();
    modeloClien.setNombre(nombre);
    modeloClien.setNit(nit);
    modeloClien.setCorreo(correo);
    modeloClien.setTelefono(telefono);
        
    String mensaje = modeloClien.InsertarCliente(modeloClien);
    return mensaje;
    }

public void iniciar() {
    vistaMenuPrin.setVisible(true);
}
}
