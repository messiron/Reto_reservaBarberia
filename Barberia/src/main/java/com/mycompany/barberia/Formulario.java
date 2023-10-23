
package com.mycompany.barberia;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Formulario {
    
    
    ManejoArchivo mFile=   new ManejoArchivo()           ;
    int opcion;
    
        public void menuPrincipal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1- Cliente \n 2- Barbero \n 3- administracion \n 4-Salir \n\n\n\n"));
        switch (opcion) {   
            case 1:
               menuCliente();
                
                break;
            case 2:
                System.exit(0);
                break;
            case 3: 
                String usuario = JOptionPane.showInputDialog("usuario");
                String contraseña= JOptionPane.showInputDialog("contraseña");
                formularioAdmin();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no Valida!");

        }
       
    }
        
        public void formularioAdmin(){
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1- agregar servicio \n 2- actualizar servicio \n 3- eliminar servicio\n 4-controlar reporte \n 5.listar \n\n\n\n"));
            moduloAdmin moduloAdmin = new moduloAdmin();
            
            switch (opcion) {
                case 1:
                    moduloAdmin.agregarServicio();   
                    
                    break;
                case 2:
                    moduloAdmin.actualizarServicio();
                    break;
                case 3:
                    break;
                    case 4:
                    break;
                    case 5:
                        
                       String listaServicio = moduloAdmin.listarServicio();
                    break;
                default:
                    throw new AssertionError();
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
                 eliminarReserva();
                break;
                default:
                    throw new AssertionError();
            }
        }
        
         public void realizarReserva() {
            moduloAdmin admin = new moduloAdmin();
             Cliente cliente = new Cliente();
             Validaciones valida = new Validaciones();
             Gestion listar = new Gestion();
            int cc=Integer.parseInt(JOptionPane.showInputDialog("Cedula"));
            int idBarbero;
            int idServicio;
            try{
             if (valida.validarExistencia(cc)){
            idBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Brayan: 8:00am - 12:00pm \n 2-Deivy: 12:00pm - 4:00pm \n 3-Santiago:4:00pm - 8:00pm \n\n\n\n"));
            
                        JOptionPane.showMessageDialog(null, "voy a listar " );
                        String texto = admin.listarServicio();
             idServicio = Integer.parseInt(JOptionPane.showInputDialog(null,texto));
             }else{
                 cliente.setId(cc);
            cliente.setNombre(JOptionPane.showInputDialog("Nombre: "));
            cliente.setTelefono(JOptionPane.showInputDialog("Telefono: "));
            mFile.createRegistro("clientes.txt", cliente);
            
            idBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Brayan: 8:00am - 12:00pm \n 2-Deivy: 12:00pm - 4:00pm \n 3-Santiago:4:00pm - 8:00pm \n\n\n\n"));
                        JOptionPane.showMessageDialog(null, "voy a listar " );
        

            
            String texto = admin.listarServicio();
            
             idServicio = Integer.parseInt(JOptionPane.showInputDialog(null,texto));
            
             }
            }catch (Exception e){
            }
             
          
         
        }
         public void eliminarReserva(){
         int id =(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula para eliminar  ")));
         ManejoArchivo eliminar = new ManejoArchivo();
         eliminar.eliminarRegistro(id, "clientes.txt");
         }
}



