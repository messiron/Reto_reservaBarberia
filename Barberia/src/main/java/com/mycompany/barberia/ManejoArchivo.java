
package com.mycompany.barberia;

import java.io.*;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class ManejoArchivo {
    File texto;
        
      public void createRegistro(String nombreArchivo, Cliente cliente)  {
    try {
        
                
         texto= new File(nombreArchivo);
          
        if (texto.exists()) {
            
            FileOutputStream archivo2 = new FileOutputStream(nombreArchivo, true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(cliente);
            archivo2.close();
            miojectOutputStream.close();
           
        } else {
            
            
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
public void eliminarRegistro(int id, String nombreArchivo){
    texto = new File(nombreArchivo);
    HashMap<Integer,Cliente> hashCliente= new HashMap<>();
    Cliente cliente = new Cliente();
    try{
    if(texto.exists()){
    FileInputStream filein = new FileInputStream(nombreArchivo);
    ObjectInputStream in = new ObjectInputStream(filein);
    while(true){
        try{
            cliente = (Cliente)in.readObject();
            hashCliente.put(cliente.getId(), cliente);
        }catch(Exception e){
        break;
        }
    }
      filein.close();
      in.close();
      if(hashCliente.containsKey(id));
      hashCliente.remove(id);
    

    }
    }catch(Exception e){
    }

}
        
}
