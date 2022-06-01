/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ellenportugues
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true; 
        
        if(rutaAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan är tom");
            resultat = false;
        }
        
        return resultat;
        
    }
  
    //metod för fält som ska vara int, 
    //Anväbds inte någonstans ÄN :) annars ta bort
     public static boolean isHeltal (JTextField rutaAttKolla){
        boolean resultat = true;
        
        try {
            String inString = rutaAttKolla.getText();
            Integer.parseInt(inString);
            rutaAttKolla.requestFocus();
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
        }
        
         return resultat;
    }
     
     
     public static boolean adminStatus (String aktuelladmin) {
        
         boolean adminStatus = false;
         
         
         if(aktuelladmin.equals("J")){
         adminStatus = true;
         }
            
         else if (aktuelladmin.equals("N")){
         adminStatus = false;    
            
         }
         else {
         adminStatus = false;
         }
             
         
         return adminStatus;
     }
     

    

    public static boolean datumKontroll (String datum){
       SimpleDateFormat datumformat = new SimpleDateFormat ("yyyy-mm-dd");
       datumformat.setLenient(false);
       
        try{
            Date datumAttKolla = datumformat.parse(datum);
            return true;
        }
        
        catch(ParseException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Fel format på datum. Skriv det ÅÅÅÅ-MM-DD");
            return false;
        
}
        
}
}