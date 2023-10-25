
package com.mycompany.barberia;

import java.io.*;

import java.util.*;
import javax.swing.*;

public class ManejoArchivoB {
    File texto;

    public ManejoArchivoB() {
    }
        
      public void crearBarbero (Barbero barbero)  {
          
    try {
        
         String nombreArchivo = "Barbero.txt";      
         texto= new File(nombreArchivo);
          
        if (texto.exists()) {
            
            FileOutputStream archivo2 = new FileOutputStream(nombreArchivo, true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(barbero);
            archivo2.close();
            miojectOutputStream.close();
           
        } else {
            
            
            FileOutputStream archivo = new FileOutputStream(nombreArchivo, true);
            ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
            ojectOutputStream.writeObject(barbero); // Cambia aquí a ojectOutputStream
            archivo.close();
            ojectOutputStream.close();
            JOptionPane.showMessageDialog(null, "Creado Agregado!");
        }
    } catch (Exception e) {
        
    }
}  
public void eliminarRegistro(int id, String nombreArchivo){
    texto = new File(nombreArchivo);
    HashMap<Integer,Barbero> hashBarbero= new HashMap<>();
    Barbero barbero= new Barbero();
    try{
    if(texto.exists()){
    FileInputStream filein = new FileInputStream(nombreArchivo);
    ObjectInputStream in = new ObjectInputStream(filein);
    while(true){
        try{
            barbero = (Barbero)in.readObject();
            hashBarbero.put(barbero.getId(), barbero);
        }catch(Exception e){
        break;
        }
    }
      filein.close();
      in.close();
      if(hashBarbero.containsKey(id));
      hashBarbero.remove(id);
    

    }
    }catch(Exception e){
    }

}
        
}

