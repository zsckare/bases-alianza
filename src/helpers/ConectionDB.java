/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;

/**
 *
 * @author zsckare
 */
public class ConectionDB {

   
    
    Connection cn;
    public Connection connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/base de taxis?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&jdbcCompliantTruncation=false", "root", "");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return cn;
    }
    public void getData() throws SQLException{
        getUsers();
        getMarcas();
        getVehiculos();
        getChoferes();
        getTitulares();
        getConcesionaros();
        
        
        
    }
    public void getUsers() throws SQLException{
        String query = "SELECT * FROM trabajadores";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){            
            Trabajador t = new Trabajador();
            t.setIdtrabajdor(rs.getInt(1));
            t.setNombre(rs.getString(2));
            t.setApellido(rs.getString(3));
            t.setDireccion(rs.getString(4));
            t.setTelefono(rs.getString(5));
            t.setContraseña(rs.getString(6));
            Comun.trabajadores.add(t);
        }
        
        System.out.println(Comun.trabajadores);
        st.close();
        
        
    }
    
    public void getChoferes()throws SQLException{
        String query = "SELECT * FROM taxista";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){   
            
            Chofer t = new Chofer();
            t.setIdtaxista(rs.getInt(1));
            t.setNombre(rs.getString(2));
            t.setApellido(rs.getString(3));
            t.setDireccion(rs.getString(4));
            t.setTelefono(rs.getString(5));
            t.setIdtipo(rs.getInt(6));
            t.setIdtaxi(rs.getInt(7));
            t.setClavesindical(rs.getString(8));
            t.setIdtipodesangre(rs.getInt(9));
            Comun.choferes.add(t);

        }
        
        System.out.println(Comun.choferes);
        st.close();
        
    }
    public void getConcesionaros()throws SQLException{
        String query = "SELECT * FROM titularplacas";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){   
            
            /*Chofer t = new Chofer();
            t.setIdtaxista(rs.getInt(1));
            t.setNombre(rs.getString(2));
            t.setApellido(rs.getString(3));
            t.setDireccion(rs.getString(4));
            t.setTelefono(rs.getString(5));
            
            Comun.choferes.add(t);
*/
        }
            
     }    
    public void getTitulares() throws SQLException{
        if(!Comun.titulares.isEmpty()){
            Comun.titulares.clear();
        }
          String query = "SELECT * FROM duenocarro";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){   
            
            Titular titular = new Titular();
            titular.setIdduenocarro(rs.getInt(1));
            titular.setNombre(rs.getString(2));
            titular.setApellido(rs.getString(3));
            titular.setDireccion(rs.getString(4));
            titular.setTelefono(rs.getString(5));
            titular.setIdtaxi(rs.getInt(7));
            titular.setIdtipo(rs.getInt(6));
            titular.setClavesindical(rs.getString(8));
            titular.setVehiculo(getVehicle(rs.getInt(7)));
            Comun.titulares.add(titular);
        }
        
       // System.out.println(Comun.titulares);
     }     
    public void getTipoSangre(){        
    }
    public void getMarcas()throws SQLException{   
         if(!Comun.marcas.isEmpty()){
            Comun.marcas.clear();
        }
          String query = "SELECT * FROM marcataxis";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){   
            
            Marca marca = new Marca();
            marca.setIdmarca(rs.getInt(1));
            marca.setMarca(rs.getString(2).toUpperCase());
            marca.setModelo(rs.getString(3).toUpperCase());
            Comun.marcas.add(marca);
        }
        
    }
    public void getVehiculos() throws SQLException{ 
        if(!Comun.vehiculos.isEmpty()){
            Comun.vehiculos.clear();
        }
          String query = "SELECT * FROM taxis ORDER BY numerotaxi ASC";
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){   
            
            Taxi taxi = new Taxi();
            taxi.setIdtaxi(rs.getInt(1));
            taxi.setNumerotaxi(rs.getString(2));
            taxi.setNumeroplaca(rs.getString(3).toUpperCase());
            taxi.setIdmarca(rs.getInt(4));
            Comun.vehiculos.add(taxi);
        }
        
        System.out.println(Comun.vehiculos);
        
    }
    public void deleteInDB(int id, int bd) {
        System.out.println("Eliminar-->");
        System.out.println(id);
        if(bd ==1){
            String query = "delete from duenocarro where idduenocarro = ?";
            PreparedStatement preparedStmt;
            try {
                preparedStmt = cn.prepareStatement(query);
                preparedStmt.setInt(1, id);
                preparedStmt.execute();
                
            } catch (SQLException ex) {
                Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }
        
    }
          
    
    private Taxi getVehicle(int id){
        Taxi taxi = new Taxi();
        for (int i = 0; i < Comun.vehiculos.size(); i++) {
            if (Comun.vehiculos.get(i).getIdtaxi()==id){
                return Comun.vehiculos.get(i);
            }
            
        }
        return taxi;
    }
}
