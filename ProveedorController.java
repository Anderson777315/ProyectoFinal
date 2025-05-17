/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import dao.ProveedorDAO;
import Modelo.Proveedor;
import java.util.List;
/**
 *
 * @author JOSUE RAMOS
 */
public class ProveedorController {
    private final ProveedorDAO dao = new ProveedorDAO();
    
    public void agregarProveedor(String nombre, String nit, String contacto,String direccion, String telefonoemp, String telefonocon ){
    Proveedor emp = new Proveedor(nombre, nit, contacto,direccion,telefonoemp,telefonocon);
    dao.guardar (emp);
    }
    
}
