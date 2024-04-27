/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventaelectronico;

import ventaelectronico.controller.ClienteCtrl;
import ventaelectronico.controller.CompraCtrl;
import ventaelectronico.controller.DetalleCompraCtrl;
import ventaelectronico.controller.DetalleVentaCtrl;
import ventaelectronico.controller.FacturaCtrl;
import ventaelectronico.controller.ProductoCtrl;
import ventaelectronico.controller.ProveedorCtrl;
import ventaelectronico.controller.ProveedorProductoCtrl;
import ventaelectronico.controller.VentaCtrl;
import ventaelectronico.model.ClienteModel;
import ventaelectronico.model.CompraModel;
import ventaelectronico.model.DetalleCompraModel;
import ventaelectronico.model.DetalleVentaModel;
import ventaelectronico.model.FacturaModel;
import ventaelectronico.model.ProductoModel;
import ventaelectronico.model.ProveedorModel;
import ventaelectronico.model.ProveedorProductoModel;
import ventaelectronico.model.VentaModel;
import ventaelectronico.view.MenuPrincipal;

public class VentaElectronico {

    public static void main(String[] args) {
        
    MenuPrincipal vistaMenuPrincipal = new MenuPrincipal();
    
    ClienteModel modeloClien = new ClienteModel();
    ClienteCtrl controladorClien = new ClienteCtrl(modeloClien, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorClien);

    ProveedorModel modeloProv = new ProveedorModel();
    ProveedorCtrl controladorPov = new ProveedorCtrl(modeloProv, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorPov);
    
    CompraModel modeloCom = new CompraModel();
    CompraCtrl controladorCom = new CompraCtrl(modeloCom, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorCom);
    
    VentaModel modeloVen = new VentaModel();
    VentaCtrl controladorVen = new VentaCtrl(modeloVen, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorCom);
    
    DetalleCompraModel modeloDetCom = new DetalleCompraModel();
    DetalleCompraCtrl controladorDetCom = new DetalleCompraCtrl(modeloDetCom, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorDetCom);
    
    DetalleVentaModel modeloDetVen = new DetalleVentaModel();
    DetalleVentaCtrl controladorDetVen = new DetalleVentaCtrl(modeloDetVen, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorDetVen);
    
    FacturaModel modeloFact = new FacturaModel();
    FacturaCtrl controladorFact = new FacturaCtrl(modeloFact, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorFact);

    ProductoModel modeloProd = new ProductoModel();
    ProductoCtrl controladorProd = new ProductoCtrl(modeloProd, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorProd);
    
    ProveedorProductoModel modeloProvProd = new ProveedorProductoModel();
    ProveedorProductoCtrl controladorProvProd = new ProveedorProductoCtrl(modeloProvProd, vistaMenuPrincipal);
    vistaMenuPrincipal.SetVistaMenu(controladorProvProd);
    
    controladorClien.iniciar();
    controladorPov.iniciar();
    controladorCom.iniciar();
    controladorVen.iniciar();
    controladorDetCom.iniciar();
    controladorDetVen.iniciar();
    controladorFact.iniciar();
    controladorProd.iniciar();
    controladorProvProd.iniciar(); } 
}
