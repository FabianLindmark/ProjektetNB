/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

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
     
     
     
     
     public static boolean adminStatus (String resultat2) {
        
         boolean adminStatus = false;
         
         
         if  (resultat2.equals("J")){
         adminStatus = true;
         }
                
         else {
         adminStatus = false;
         }
             
         
         return adminStatus;
     }
     
     
     
     
     /**metod för fält som ska vara String
     public static boolean 
          
     boolean resultat = true;
     
     try{
    
        
    
        }
     catch(){
    
    
        }
     
    return resultat;
    **/
    
}