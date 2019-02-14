/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Comparator;

/**
 *
 * @author zsckare
 */
public class Chofer {
    int idtaxista, idtipo,idtaxi, idtipodesangre;
    
    String nombre, apellido, direccion, telefono, clavesindical  ,vehicle_number;
    Taxi vehiculo;


    public int getIdtaxista() {
        return idtaxista;
    }

    public void setIdtaxista(int idtaxista) {
        this.idtaxista = idtaxista;
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

    public int getIdtipodesangre() {
        return idtipodesangre;
    }

    public void setIdtipodesangre(int idtipodesangre) {
        this.idtipodesangre = idtipodesangre;
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

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public Taxi getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Taxi vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    @Override
    public String toString() {
        return "Chofer{" + "idtaxista=" + idtaxista + ", idtipo=" + idtipo + ", idtaxi=" + idtaxi + ", idtipodesangre=" + idtipodesangre + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", clavesindical=" + clavesindical + '}';
    }
    public static Comparator<Chofer> TitualrVehicleNumner = new Comparator<Chofer>() {

	public int compare(Chofer s1, Chofer s2) {
	   String StudentName1 = s1.getVehicle_number().toUpperCase();
	   String StudentName2 = s2.getVehicle_number().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
    }};
    
}
