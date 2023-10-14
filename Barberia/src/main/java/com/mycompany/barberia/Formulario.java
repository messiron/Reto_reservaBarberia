
package com.mycompany.barberia;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Formulario {
    
    
    ManejoArchivo mFile=   new ManejoArchivo()           ;
    int opcion;
    
        public void menuPrincipal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1- Cliente \n 2- Barbero \n 3-Salir \n\n\n\n"));

        switch (opcion) {   
            case 1:
               menuCliente();
                
                break;
            case 2:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no Valida!");

        }
       
    }
        
        public void menuCliente() {
             opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Realizar reserva \n 2-Editar reserva \n 3-Eliminar Reserva \n\n\n\n"));
             
             switch (opcion) {
             case 1:
            realizarReserva();
            break;
             case 2:
                 
                 break;
                 
             case 3:
                 
                break;
                default:
                    throw new AssertionError();
            }
        }
        
         public void realizarReserva() {
             
             Cliente cliente = new Cliente();
         
            cliente.setNombre(JOptionPane.showInputDialog("Nombre: "));
            cliente.setTelefono(JOptionPane.showInputDialog("Telefono: "));
            cliente.setId(Integer.parseInt(JOptionPane.showInputDialog("Cedula")));
             try{
             mFile.createRegistro("clientes.txt", cliente);
             }catch(Exception e){
             }
         }
}



