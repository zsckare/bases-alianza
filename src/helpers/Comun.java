/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.ArrayList;
import java.util.LinkedList;
import models.*;

/**
 *
 * @author zsckare
 */
public class Comun {
    public static ArrayList<Trabajador>trabajadores = new ArrayList<>();
    public static ArrayList<Titular>titulares = new ArrayList<>();
    public static ArrayList<Concesionario>concesionarios = new ArrayList<>();
    public static ArrayList<Taxi>vehiculos = new ArrayList<>();
    public static ArrayList<Marca>marcas = new ArrayList<>();    
    public static ArrayList<TipoSangre>tipodesangre = new ArrayList<>();    
    public static ArrayList<Chofer>choferes = new ArrayList<>();
    public static boolean isEditing = false;
    
    //Editables
    public static Titular selectedTitular;
}
