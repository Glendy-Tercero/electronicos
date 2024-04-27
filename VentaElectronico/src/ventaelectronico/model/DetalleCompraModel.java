/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class DetalleCompraModel {
  
    int idDetalleCompra, idCompra, idProducto, cantidad;
    double precioUnitario, total;
    private Conexion conexion;
    
    public DetalleCompraModel() {
        conexion = new Conexion();
    }
    
     public int getIdDetalleCompra() {
       return this.idDetalleCompra;
   } 
   public int getIdCompra() {
       return this.idCompra;
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
   
   public void setIdDetalleCompra(int idDetalleCompra) {
   this.idDetalleCompra = idDetalleCompra;
   } 
   public void setIdCompra(int idCompra) {
   this.idCompra = idCompra;
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
    
public String InsertarDetalleCompra(DetalleCompraModel modeloDetCom) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarDetalleCompra = "{call InsertarDetalleCompra(?, ?, ?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarDetalleCompra);
            statement.setInt(1, modeloDetCom.getIdCompra());
            statement.setInt(2, modeloDetCom.getIdProducto());
            statement.setDouble(3, modeloDetCom.getPrecioUnitario());
            statement.setInt(4, modeloDetCom.getCantidad());          
            statement.setDouble(5, modeloDetCom.getTotal());
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
