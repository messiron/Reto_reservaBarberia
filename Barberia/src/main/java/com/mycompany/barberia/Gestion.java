
package com.mycompany.barberia;

import java.io.*;
import java.util.*;
import javax.swing.*;


public class Gestion {

    public Gestion() {
    }
   
    File texto;
        
      public void createRegistro(Servicio servicio)  {
    try {
        
         String nombreArchivo= "servicios.txt";     
         texto= new File(nombreArchivo);
          
        if (texto.exists()) {
            
            FileOutputStream archivo2 = new FileOutputStream(nombreArchivo, true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(servicio);
            archivo2.close();
            miojectOutputStream.close();
           
        } else {
            
            
            FileOutputStream archivo = new FileOutputStream(nombreArchivo, true);
            ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
            ojectOutputStream.writeObject(servicio); // Cambia aquí a ojectOutputStream
            archivo.close();
            ojectOutputStream.close();
            JOptionPane.showMessageDialog(null, "Creado Agregado!");
        }
    } catch (Exception e) {
        
    }
       
          
    
  
    }
      
}
