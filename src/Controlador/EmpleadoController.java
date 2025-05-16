/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
    import dao.EmpleadoDAO;
    import Modelo.Empleados;
    import java.util.List;

public class EmpleadoController {
    private final EmpleadoDAO dao = new EmpleadoDAO();
    public List<Empleados> obtenerEmpleados (){
    return dao.obtenerTodos();
    }//constructor
    public void agregarEmpleado(String nombre, String apellido, String puesto,String telefono, String direccion, boolean estado, String fecha ,double salario, String email){
    Empleados emp = new Empleados(0, nombre, apellido, puesto, telefono,direccion,estado,fecha,salario,email);
    dao.guardar (emp);
    }
    
    public void actualizarEmpleado(int id, String nombre, String apellido, String puesto,String telefono, String direccion, boolean estado, String fecha ,double salario, String email){
    Empleados emp = new Empleados(id, nombre, apellido, puesto, telefono,direccion,estado,fecha,salario,email);
    dao. actualizar (emp);
    }
    public void eliminarEmpleado(int id) {
    dao. eliminar (id);
}
    
}