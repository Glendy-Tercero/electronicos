/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class VentaModel {
   
    String fecha;
    int idVenta, idCliente;
    double total;
    private Conexion conexion;
    
    public VentaModel() {
        conexion = new Conexion();
    }
    
     public int getIdVenta() {
       return this.idVenta;
   } 
    public String getFecha() {
       return this.fecha;
   }
   public int getIdCliente() {
       return this.idCliente;
   }
   public double getTotal() {
       return this.total;
   }
   
   public void setIdVenta(int idVenta) {
   this.idVenta = idVenta;
   } 
    public void setFecha(String fecha) {
    this.fecha = fecha;
   } 
   public void setIdCliente(int idCliente) {
   this.idCliente = idCliente;
   } 
    public void setTotal(double total) {
    this.total = total;
   }    
    
public String InsertarVenta(VentaModel modeloVen) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarVenta = "{call InsertarVenta(?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarVenta);
            statement.setInt(1, modeloVen.getIdCliente());
            statement.setString(2, modeloVen.getFecha());           
            statement.setDouble(3, modeloVen.getTotal());
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