/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class FacturaModel {
  
    String fecha;
    int idFactura, idVenta;
    double total;
    private Conexion conexion;
    
    public FacturaModel() {
        conexion = new Conexion();
    }
    
     public int getIdFactura() {
       return this.idFactura;
   }  
    public String getFecha() {
       return this.fecha;
   }
   public int getIdVenta() {
       return this.idVenta;
   }
   public double getTotal() {
       return this.total;
   }
   
    public void setIdFactura(int idFactura) {
    this.idFactura = idFactura;
   }  
    public void setFecha(String fecha) {
    this.fecha = fecha;
   } 
    public void setIdVenta(int idVenta) {
    this.idVenta = idVenta;
   } 
    public void setTotal(double total) {
    this.total = total;
   }   
    
public String InsertarFactura(FacturaModel modeloFact) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarFactura = "{call InsertarFactura(?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarFactura);
            statement.setInt(1, modeloFact.getIdVenta());
            statement.setString(2, modeloFact.getFecha());         
            statement.setDouble(3, modeloFact.getTotal());
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
