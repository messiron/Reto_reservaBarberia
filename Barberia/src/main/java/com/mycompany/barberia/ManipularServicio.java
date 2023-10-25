package com.mycompany.barberia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.*;
import javax.tools.FileObject;


public class ManipularServicio {
    
    
    File file;
    
    public void createRegistro() {
            Servicio servicio = new Servicio();
        try {
            servicio.setId(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese id del servicio")));
            servicio.setNombre(JOptionPane.showInputDialog(null, "ingrese nombre del servicio"));
            servicio.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese precio del servicio")));
            file = new File("Servicio.txt");
            if(file.exists()){
             FileOutputStream archivo2 = new FileOutputStream("Servicio.txt", true);
            MiObjectOutputStream miojectOutputStream = new MiObjectOutputStream(archivo2);
            miojectOutputStream.writeObject(servicio);
            archivo2.close();
            miojectOutputStream.close();
            }else {
            FileOutputStream archivo = new FileOutputStream("Servicio.txt", true);
            ObjectOutputStream ojectOutputStream = new ObjectOutputStream(archivo);
            ojectOutputStream.writeObject(servicio); // Cambia aquí a ojectOutputStream
            archivo.close();
            ojectOutputStream.close();
            }
        }catch(Exception e) {
            
        }
    }
    
    public void eliminarRegistro(int id){
        String nombreArchivo = "Servicio.txt";
        file = new File(nombreArchivo);
        
    HashMap<Integer,Servicio> hashServicio= new HashMap<>();
    Servicio servicio = new Servicio();
    try{
    if(file.exists()){
    FileInputStream filein = new FileInputStream(nombreArchivo);
    ObjectInputStream in = new ObjectInputStream(filein);
    while(true){
        try{
            servicio = (Servicio)in.readObject();
            hashServicio.put(servicio.getId(), servicio);
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
    
    public String lista (String nombreArchivo){
         
        String resul;
        resul="";
    file = new File (nombreArchivo);
    Servicio servicio = new Servicio();
    
    List<Servicio> listaServicio = new ArrayList<>();
    try{
    if(file.exists()){
         JOptionPane.showMessageDialog(null, "existe archivo");
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
     System.out.println(resul);
    return resul;
    }
    
}
