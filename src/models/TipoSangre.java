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
public class TipoSangre {
    int idtiposangre;
    String tiposangre;

    public int getIdtiposangre() {
        return idtiposangre;
    }

    public void setIdtiposangre(int idtiposangre) {
        this.idtiposangre = idtiposangre;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

    @Override
    public String toString() {
        return "TipoSangre{" + "idtiposangre=" + idtiposangre + ", tiposangre=" + tiposangre + '}';
    }
    
    
}
