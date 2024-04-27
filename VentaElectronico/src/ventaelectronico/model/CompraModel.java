/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class CompraModel {
   
    String fecha;
    int idCompra, idProveedor;
    double total;
    private Conexion conexion;
    
    public CompraModel() {
        conexion = new Conexion();
    }
    
     public int getIdCompra() {
       return this.idCompra;
   } 
    public String getFecha() {
       return this.fecha;
   }
   public int getIdProveedor() {
       return this.idProveedor;
   }
   public double getTotal() {
       return this.total;
   }
   
   public void setIdCompra(int idCompra) {
   this.idCompra = idCompra;
   } 
    public void setFecha(String fecha) {
    this.fecha = fecha;
   } 
   public void setIdProveedor(int idProveedor) {
   this.idProveedor = idProveedor;
   } 
    public void setTotal(double total) {
    this.total = total;
   }    
    
public String InsertarCompra(CompraModel modeloCom) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarCompra = "{call InsertarCompra(?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarCompra);
            statement.setInt(1, modeloCom.getIdProveedor());
            statement.setString(2, modeloCom.getFecha());
            statement.setDouble(3, modeloCom.getTotal());
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