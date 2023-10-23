/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.barberia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author deivy
 */
public class ManipularReserva {
      File file;

    public ManipularReserva() {
    }
      
      
    
    public void createRegistro(Reserva reservaAdd) {
            
        try {
            
            
            file = new File("servicio.txt");
            if(file.exists()){
             FileOutputStream archivo2 = new FileOutputStream("servicio.txt", true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(reservaAdd);
            archivo2.close();
            miojectOutputStream.close();
            }else {
            FileOutputStream archivo = new FileOutputStream("servicio.txt", true);
            ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
            ojectOutputStream.writeObject(reservaAdd);// Cambia aquí a ojectOutputStream
            archivo.close();
            ojectOutputStream.close();
            }
        }catch(Exception e) {
            
        }
    }
    
    public void eliminarRegistro(int id){
        String nombreArchivo = "servicio.txt";
        file = new File(nombreArchivo);
        
    HashMap<Integer,Servicio> hashServicio= new HashMap<>();
    Reserva reserva = new Reserva();
    try{
    if(file.exists()){
    FileInputStream filein = new FileInputStream(nombreArchivo);
    ObjectInputStream in = new ObjectInputStream(filein);
    while(true){
        try{
            reserva = (Reserva)in.readObject();
            hashServicio.put(reserva.getId(), reserva);
        }catch(Exception e){
        break;
        }
    }
      filein.close();
      in.close();
      if(hashServicio.containsKey(id));
      hashServicio.remove(id);
      updateFile(hashServicio, nombreArchivo);
   
    }
    }catch(Exception e){
    }

}
    
    public void updateFile(HashMap<Integer, Servicio> hashUpdate, String nombreArchivo){
            
              try {
                   FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
                ObjectOutputStream ojectOutputStream = new ObjectOutputStream(fileOut);
                JOptionPane.showMessageDialog(null, "Se va crear el archivo" );
                for(Servicio servicio  : hashUpdate.values()){
                    ojectOutputStream.writeObject(servicio);
                }
                
              }catch(Exception e) {
                  
              }
    }
    /*
    public String lista (String nombreArchivo){
         
        String resul;
        resul="";
    file = new File (nombreArchivo);
    Reserva reserva = new Reserva();
    
    List<Servicio> listaServicio = new ArrayList<>();
    try{
    if(file.exists()){
         JOptionPane.showMessageDialog(null, "existe archivo");
        FileInputStream fileIn = new FileInputStream(nombreArchivo);
        ObjectInputStream In = new ObjectInputStream(fileIn);
        while(true){
        try{
            reserva=(Reserva) In.readObject();
            listaServicio.add(reserva);
            
        }catch(Exception e){
            break;
        }
                }
        fileIn.close();
        In.close();
        
       for(Reserva reserva1 : listaReserva)
       resul = resul + " " + reserva1.getId() + " " + reserva1.getCliente().setNombre(resul) + " " + reserva1.getBarbero().setNombre()+ "\n";
    }
    }catch(Exception e){
    }
     System.out.println(resul);
    return resul;
    }

*/
    
}
