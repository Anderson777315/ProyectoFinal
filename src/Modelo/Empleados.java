/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JOSUE RAMOS
 */
public class Empleados {
        private int id;
    private String nombre;
    private String apellido;
    private String puesto;  
    private String telefono;  
    private String direccion;  
    private boolean estado;  
    private String fecha;  
    private double salario;
    private String email;
    
 public Empleados(){
    this.id = 0;
    this.nombre = "";
    this.apellido = "";
    this.puesto = "";
    this.telefono="";
    this.direccion="";
    this.estado=true;
    this.fecha="";
    this.salario = 0; 
    this.email = ""; 
 }
 public Empleados(int id, String nombre, String apellido, String puesto,String telefono, String direccion, boolean estado, String fecha ,double salario, String email){
 this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.puesto = puesto;
    this.telefono=telefono;
    this.direccion=direccion;
    this.estado=estado;
    this.fecha=fecha;
    this.salario = salario; 
    this.email = email;  
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
}
