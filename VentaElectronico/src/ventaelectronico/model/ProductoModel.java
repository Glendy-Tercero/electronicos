/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class ProductoModel {
    
    String nombre;
    int idProducto, existencia;
    double precio;
    Conexion conexion;
    
    public ProductoModel() {
        conexion = new Conexion();
    }
    
     public int getIdProducto() {
       return this.idProducto;
   } 
    public String getNombre() {
       return this.nombre;
   }
   public int getExistencia() {
       return this.existencia;
   }
   public double getPrecio() {
       return this.precio;
   }
   
   public void setIdProducto(int idProducto) {
   this.idProducto = idProducto;
   }  
    public void setNombre(String nombre) {
    this.nombre = nombre;
   } 
   public void setExistencia(int existencia) {
   this.existencia = existencia;
   } 
    public void setPrecio(double precio) {
    this.precio = precio;
   }    
    
public String InsertarProducto(ProductoModel modeloProd) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarProducto = "{call InsertarProducto(?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarProducto);
            statement.setString(1, modeloProd.getNombre());
            statement.setDouble(2, modeloProd.getPrecio());        
            statement.setInt(3, modeloProd.getExistencia());
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