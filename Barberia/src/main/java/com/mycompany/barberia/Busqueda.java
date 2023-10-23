
package com.mycompany.barberia;

import java.io.*;
import java.util.*;
import java.util.Map;
import javax.tools.*;

public class Busqueda {
      File file;
      String nombreArchivo;
    public Servicio buscarServicio(int id){
       nombreArchivo = "servicio.txt";
       Servicio servicio = new Servicio();
        Map<Integer , Servicio> map = new HashMap<>();
       try {
           file = new File(nombreArchivo);
           if(file.exists()) {
               FileInputStream fileIn = new FileInputStream(nombreArchivo);
               ObjectInputStream in = new ObjectInputStream(fileIn);
               while (true){
                   try {
                       servicio = (Servicio)in.readObject();
                       map.put(servicio.getId(),servicio);
                       
                   }catch (Exception e){
                       break;
                   }
               }
           }
           
          
       }catch(Exception e) {
       
       }
        servicio = map.get(id);
        return servicio;
    }
    
    
    public Cliente buscarCliente(int id){
        nombreArchivo = "cliente.txt";
        Cliente cliente = new Cliente();
         Map<Integer , Cliente> map = new HashMap<>();
       try {
           file = new File(nombreArchivo);
           if(file.exists()) {
               FileInputStream fileIn = new FileInputStream(nombreArchivo);
               ObjectInputStream in = new ObjectInputStream(fileIn);
               while (true){
                   try {
                       cliente = (Cliente)in.readObject();
                       map.put(cliente.getId(),cliente);
                       
                   }catch (Exception e){
                       break;
                   }
               }
           }
           
          
       }catch(Exception e) {
       
       }
        cliente = map.get(id);
        return cliente;
      
    }
    

    public Barbero buscarBarbero(int id){
        nombreArchivo = "barbero.txt";
        Barbero barbero = new Barbero();
         Map<Integer , Barbero> map = new HashMap<>();
       try {
           file = new File(nombreArchivo);
           if(file.exists()) {
               FileInputStream fileIn = new FileInputStream(nombreArchivo);
               ObjectInputStream in = new ObjectInputStream(fileIn);
               while (true){
                   try {
                       barbero = (Barbero)in.readObject();
                       map.put(barbero.getId(),barbero);
                       
                   }catch (Exception e){
                       break;
                   }
               }
           }
           
          
       }catch(Exception e) {
       
       }
        barbero = map.get(id);
        return barbero;
      
    }
    }


