
package com.mycompany.barberia;

import javax.swing.JOptionPane;

public class moduloAdmin {
    ManipularServicio manipularServicio = new ManipularServicio();
    public void agregarServicio(){ 
       manipularServicio.createRegistro();
    }
    
    public void eliminarServicio(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("ingrese id"));
        manipularServicio.eliminarRegistro(id);
    }
    
    public void actualizarServicio(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese id"));
    }
    public void controlarServicio(){
    
    }
    
    public String listarServicio(){
      
        String resultado = manipularServicio.lista("servicio.txt");
        return resultado;
    }
    
}
