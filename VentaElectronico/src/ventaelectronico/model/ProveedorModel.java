/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class ProveedorModel {
   
    String nombre, direccion, correo;
    int idProveedor, telefono;
    private Conexion conexion;
    
    public ProveedorModel() {
        conexion = new Conexion();
    }
    
     public int getIdProveedor() {
       return this.idProveedor;
   }  
     public String getNombre() {
       return this.nombre;
   }
     public String getDireccion() {
       return this.direccion;
   }
    public String getCorreo() {
       return this.correo;
   }
   public int getTelefono() {
       return this.telefono;
   }
   
   public void setIdProveedor(int idProveedor) {
   this.idProveedor = idProveedor;
   }     
    public void setNombre(String nombre) {
    this.nombre = nombre;
   }
    public void setDireccion(String direccion) {
    this.direccion = direccion;
   }    
    public void setCorreo(String correo) {
    this.correo = correo;
   }
   public void setTelefono(int telefono) {
   this.telefono = telefono;
   }   
   
   public String InsertarProveedor(ProveedorModel modeloProv) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarProveedor = "{call InsertarProveedor(?, ?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarProveedor);
            statement.setString(1, modeloProv.getNombre());
            statement.setString(2, modeloProv.getDireccion());
            statement.setString(3, modeloProv.getCorreo());
            statement.setInt(4, modeloProv.getTelefono());
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

