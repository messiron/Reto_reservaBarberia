
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
    public String lista (String nombreArchivo){
        String resul;
        resul="";
    texto = new File (nombreArchivo);
    Servicio servicio = new Servicio();
    List<Servicio> listaServicio = new ArrayList<>();
    try{
    if(texto.exists()){
        FileInputStream fileIn = new FileInputStream(nombreArchivo);
        ObjectInputStream In = new ObjectInputStream(fileIn);
        while(true){
        try{
            servicio=(Servicio) In.readObject();
            listaServicio.add(servicio);
            
        }catch(Exception e){
            break;
        }
                }
        fileIn.close();
        In.close();
        
       for(Servicio servicio1 : listaServicio)
       resul = resul + " " + servicio1.getId() + " " + servicio1.getNombre() + " " + servicio1.getPrecio() + "\n";
    }
    }catch(Exception e){
    }
    return resul;
    }
    
}
