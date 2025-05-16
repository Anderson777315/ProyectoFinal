/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JOSUE RAMOS
 */
public class Proveedor {
    String nombre;
    int nit;
    String contacto;
    String telefonoEmp;
    String telefonoCon;
    
    public Proveedor(){
        this.nombre="";
        this.nit=0;
        this.contacto="";
        this.telefonoEmp="";
        this.telefonoCon="";
    }
    public Proveedor(String nombre,int nit, String contacto, String telefonoEmp, String telefonoCon){
        this.nombre=nombre;
        this.nit=nit;
        this.contacto=contacto;
        this.telefonoEmp=telefonoEmp;
        this.telefonoCon=telefonoCon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefonoEmp() {
        return telefonoEmp;
    }

    public void setTelefonoEmp(String telefonoEmp) {
        this.telefonoEmp = telefonoEmp;
    }

    public String getTelefonoCon() {
        return telefonoCon;
    }

    public void setTelefonoCon(String telefonoCon) {
        this.telefonoCon = telefonoCon;
    }
    
}
