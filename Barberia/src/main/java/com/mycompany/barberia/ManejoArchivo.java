
package com.mycompany.barberia;

import java.io.*;
import javax.swing.JOptionPane;


public class ManejoArchivo {
    File texto;
        
      public void createRegistro(String nombreArchivo, Cliente cliente)  {
    try {
         JOptionPane.showMessageDialog(null, "voy a crear!");
                
         texto= new File(nombreArchivo);
          
        if (texto.exists()) {
            JOptionPane.showMessageDialog(null, "exite");
            FileOutputStream archivo2 = new FileOutputStream(nombreArchivo, true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(cliente);
            archivo2.close();
            miojectOutputStream.close();
            JOptionPane.showMessageDialog(null, "Agregado!");
        } else {
            
             JOptionPane.showMessageDialog(null, "no exite");
            FileOutputStream archivo = new FileOutputStream(nombreArchivo, true);
            ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
            ojectOutputStream.writeObject(cliente); // Cambia aquí a ojectOutputStream
            archivo.close();
            ojectOutputStream.close();
            JOptionPane.showMessageDialog(null, "Creado Agregado!");
        }
    } catch (Exception e) {
        
    }
}  
    
}
