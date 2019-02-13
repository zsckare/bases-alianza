/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.scene.text.Text;
import models.*;
import org.xhtmlrenderer.pdf.ITextRenderer;

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
    
    public static void generatePDF(String inputHtmlPath, String outputPdfPath)
{
    try {
        String url = new File(inputHtmlPath).toURI().toURL().toString();
        System.out.println("URL: " + url);

        OutputStream out = new FileOutputStream(outputPdfPath);

        //Flying Saucer part
        ITextRenderer renderer = new ITextRenderer();

        renderer.setDocument(url);
        renderer.layout();
        renderer.createPDF(out);

        out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
