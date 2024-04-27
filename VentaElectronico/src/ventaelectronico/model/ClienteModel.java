/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class ClienteModel {
    
    String nombre, nit, correo;
    int idCliente, telefono;
    private Conexion conexion;
    
    public ClienteModel() {
        conexion = new Conexion();
    }
    
     public int getIdCliente() {
       return this.idCliente;
   }  
     public String getNombre() {
       return this.nombre;
   }
     public String getNit() {
       return this.nit;
   }
    public String getCorreo() {
       return this.correo;
   }
   public int getTelefono() {
       return this.telefono;
   }
   
   
   public void setIdCliente(int idCliente) {
   this.idCliente = idCliente;
   }  
   public void setNombre(String nombre) {
    this.nombre = nombre;
   }
    public void setNit(String nit) {
    this.nit = nit;
   }    
    public void setCorreo(String correo) {
    this.correo = correo;
   }
   public void setTelefono(int telefono) {
   this.telefono = telefono;
   }   
   
public String InsertarCliente(ClienteModel modeloClien) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarCliente = "{call InsertarCliente(?, ?, ?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarCliente);
            statement.setString(1, modeloClien.getNombre());
            statement.setString(2, modeloClien.getNit());
            statement.setString(3, modeloClien.getCorreo());
            statement.setInt(4, modeloClien.getTelefono());
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
