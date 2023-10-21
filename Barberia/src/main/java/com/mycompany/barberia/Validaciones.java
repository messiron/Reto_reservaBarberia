
package com.mycompany.barberia;

import java.io.*;
import java.util.*;


public class Validaciones {

    public Validaciones() {
    }
   
    public boolean validarExistencia (int id){
        Cliente cliente = new Cliente();
        HashMap <Integer, Integer> mapaClientes = new HashMap<>();
        try{
        FileInputStream archivo = new FileInputStream("clientes.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(archivo);
            while(true){
             try{
            cliente=(Cliente)objectInputStream.readObject(); 
            mapaClientes.put(cliente.getId(), cliente.getId());
                 System.out.println(cliente.getId());
             }catch(Exception e){
                 break;
             }
            }
            archivo.close();
            objectInputStream.close();        
        
               
    }catch(Exception e){
    }
         boolean resulatado=mapaClientes.containsValue(id);
         System.out.println(resulatado);
        return resulatado;
}
}
