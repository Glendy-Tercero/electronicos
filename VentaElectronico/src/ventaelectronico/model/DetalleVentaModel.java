/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class DetalleVentaModel {
  
    int idDetalleVenta, idVenta, idProducto, cantidad;
    double precioUnitario, total;
    private Conexion conexion;
    
    public DetalleVentaModel() {
        conexion = new Conexion();
    }
    
     public int getIdDetalleVenta() {
       return this.idDetalleVenta;
   } 
   public int getIdVenta() {
       return this.idVenta;
   }
   public int getIdProducto() {
       return this.idProducto;
   }
   public int getCantidad() {
       return this.cantidad;
   }      
   public double getPrecioUnitario() {
       return this.precioUnitario;
   }
   public double getTotal() {
       return this.total;
   }
   
   public void setIdDetalleVenta(int idDetalleVenta) {
   this.idDetalleVenta = idDetalleVenta;
   } 
   public void setIdVenta(int idVenta) {
   this.idVenta = idVenta;
   } 
   public void setIdProducto(int idProducto) {
   this.idProducto = idProducto;
   }
   public void setCantidad(int cantidad) {
   this.cantidad = cantidad;
   }
    public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
   }  
    public void setTotal(double total) {
    this.total = total;
   }  
    
public String InsertarDetalleVenta(DetalleVentaModel modeloDetVen) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarDetalleVenta = "{call InsertarDetalleVenta(?, ?, ?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarDetalleVenta);
            statement.setInt(1, modeloDetVen.getIdVenta());
            statement.setInt(2, modeloDetVen.getIdProducto());
            statement.setDouble(3, modeloDetVen.getPrecioUnitario());
            statement.setInt(4, modeloDetVen.getCantidad());         
            statement.setDouble(5, modeloDetVen.getTotal());
            statement.execute();
            return "Guardado exitosamente";
        } catch (SQLException ex) {
            return ex.getMessage();
        } finally {
            conexion.desconectar();
        }
    } else {
        return "No se puedo conectar";
    }
}  
}

