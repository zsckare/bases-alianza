/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author zsckare
 */
public class Trabajador {
    int idtrabajdor;
    String nombre, apellido, direccion, telefono, contraseña;

    public Trabajador() {
    }

    public int getIdtrabajdor() {
        return idtrabajdor;
    }

    public void setIdtrabajdor(int idtrabajdor) {
        this.idtrabajdor = idtrabajdor;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idtrabajdor=" + idtrabajdor + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
