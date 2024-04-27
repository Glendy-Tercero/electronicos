/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventaelectronico.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import ventaelectronico.Conexion;

public class ProveedorProductoModel {
   
    int idProveedorProducto, idProveedor, idProducto;
    private Conexion conexion;
    
    public ProveedorProductoModel() {
        conexion = new Conexion();
    }
    
   public int getIdProveedorProducto() {
       return this.idProveedorProducto;
   }  
   public int getIdProveedor() {
       return this.idProveedor;
   }
   public int getIdProducto() {
       return this.idProducto;
   }

   public void setIdProveedorProducto(int idProveedorProducto) {
   this.idProveedorProducto = idProveedorProducto;
   } 
   public void setIdProveedor(int idProveedor) {
   this.idProveedor = idProveedor;
   } 
   public void setIdProducto(int idProducto) {
   this.idProducto = idProducto;
   } 
 
public String InsertarProveedorProducto(ProveedorProductoModel modeloProvProd) {
    Connection cx = conexion.conectar();
    if (cx != null) {
        try {
            String spInsertarProveedorProducto = "{call InsertarProveedorProducto(?, ?)}";
            CallableStatement statement = cx.prepareCall(spInsertarProveedorProducto);
            statement.setInt(1, modeloProvProd.getIdProveedor());
            statement.setInt(2, modeloProvProd.getIdProducto());
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
