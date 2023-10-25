
package com.mycompany.barberia;

import java.io.*;
import java.util.*;
import javax.swing.*;


public class Validaciones {

    public Validaciones() {
    }
   
    public boolean validarExistencia (int id,String nombreArchivo){
        Persona persona= new Persona();
        HashMap <Integer, Integer> mapaPersona = new HashMap<>();
        try{
        FileInputStream archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(archivo);
            while(true){
             try{
            persona=(Persona)objectInputStream.readObject(); 
            mapaPersona.put(persona.getId(), persona.getId());
                 System.out.println(persona.getId());
             }catch(Exception e){
                 break;
             }
            }
            archivo.close();
            objectInputStream.close();        
        
               
    }catch(Exception e){
    }
         boolean resulatado=mapaPersona.containsValue(id);
         System.out.println(resulatado);
        return resulatado;

    }
}
