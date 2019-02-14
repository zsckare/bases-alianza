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
public class Titular {
    int idduenocarro, idtipo, idtaxi;
    String nombre, apellido, direccion, telefono, clavesindical;
    Taxi vehiculo;
    public int getIdduenocarro() {
        return idduenocarro;
    }

    public void setIdduenocarro(int idduenocarro) {
        this.idduenocarro = idduenocarro;
    }


    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public int getIdtaxi() {
        return idtaxi;
    }

    public void setIdtaxi(int idtaxi) {
        this.idtaxi = idtaxi;
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

    public String getClavesindical() {
        return clavesindical;
    }

    public void setClavesindical(String clavesindical) {
        this.clavesindical = clavesindical;
    }

    public Taxi getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Taxi vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    @Override
    public String toString() {
        return "Titular{" + "idtitularplacas=" + idduenocarro + ", idtipo=" + idtipo + ", idtaxi=" + idtaxi + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", clavesindical=" + clavesindical + '}';
    }
    
    
}
