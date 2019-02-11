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
public class Taxi {
    int idtaxi, idmarca;
    String numerotaxi, numeroplaca;

    public int getIdtaxi() {
        return idtaxi;
    }

    public void setIdtaxi(int idtaxi) {
        this.idtaxi = idtaxi;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNumerotaxi() {
        return numerotaxi;
    }

    public void setNumerotaxi(String numerotaxi) {
        this.numerotaxi = numerotaxi;
    }

    public String getNumeroplaca() {
        return numeroplaca;
    }

    public void setNumeroplaca(String numeroplaca) {
        this.numeroplaca = numeroplaca;
    }

    @Override
    public String toString() {
        return "Taxi{" + "idtaxi=" + idtaxi + ", idmarca=" + idmarca + ", numerotaxi=" + numerotaxi + ", numeroplaca=" + numeroplaca + '}';
    }
    
    
}
