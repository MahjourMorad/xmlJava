/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package filmapplication;

import java.awt.*; 
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import static org.jdom2.filter.Filters.document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.*;

/**
 *
 * @author Nouha
 */
public class FilmApplication {
	
	
static Document document = new Document();
    static void affiche(Document file){
        try{
            XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
            sortie.output(file, System.out);
        }
            catch(java.io.IOException e){}  
    }
    static void save(String filename)
    {
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        try {
            sortie.output(document,new FileOutputStream(filename));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SAXBuilder builder  = new SAXBuilder();
        Document xml= null ;
        try {
            xml = builder.build(new File("Film.xml")) ;
        }catch (IOException e) {
            
        } catch (JDOMException ex) {
            Logger.getLogger(FilmApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        Element root= xml.getRootElement();
        System.out.println("La racine"+root.getName());
        // afficher le fichier fil.sml
        affiche(xml);
    }
    
}
