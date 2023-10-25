package com.mycompany.barberia;

import java.io.*;

import javax.swing.JOptionPane;

public class Formulario {

    ManejoArchivo mFile = new ManejoArchivo();
    int opcion;

    public void menuPrincipal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1- Cliente \n 2- Barbero \n 3- administracion \n 4-Salir \n\n\n\n"));
        switch (opcion) {
            case 1:
                menuCliente();

                break;
            case 2:
                menuBarbero();
                break;
            case 3:
                String usuario = JOptionPane.showInputDialog("usuario");
                String contraseña = JOptionPane.showInputDialog("contraseña");
                formularioAdmin();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no Valida!");

        }

    }

    public void formularioAdmin() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1- agregar servicio \n 2- actualizar servicio \n 3- eliminar servicio\n 4-controlar reporte \n 5.listar \n 6.Crear Barbero \n\n\n\n"));
        moduloAdmin moduloAdmin = new moduloAdmin();
        Validaciones valida = new Validaciones();
        Barbero barbero = new Barbero();
        ManejoArchivoB mfile =new ManejoArchivoB();
        
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
                case 6:
                int cc = Integer.parseInt(JOptionPane.showInputDialog("Cedula"));
                if (valida.validarExistencia(cc, "Barbero.txt")){
                JOptionPane.showMessageDialog(null, "Barbero Existe");
                }else{
                barbero.setId(Integer.parseInt(JOptionPane.showInputDialog("ID ")));
                barbero.setNombre(JOptionPane.showInputDialog("Nombre: "));
                barbero.setTelefono(JOptionPane.showInputDialog("Telefono: "));
                mfile.crearBarbero(barbero);
                }

                break;
            default:
                throw new AssertionError();
        }
        menuPrincipal();
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
        menuPrincipal();
    }

    public void menuBarbero() {
        Barbero barbero = new Barbero();
        Validaciones valida = new Validaciones();

        int cc = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        try {
            if (valida.validarExistencia(cc, "Barbero.txt")) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Ver Agenda \n 2-Salir \n \n\n\n\n"));
                switch (opcion) {
                    case 1:

                        break;
                    case 2:
                        System.exit(0);
                        break;
                    default:
                        throw new AssertionError();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Barbero no existe.. Comunicate con ADMIN ");
            }
        } catch (Exception e) {
        }
        menuPrincipal();    
    }

    public void realizarReserva() {
        moduloAdmin admin = new moduloAdmin();
        Cliente cliente = new Cliente();
        Validaciones valida = new Validaciones();
        Gestion listar = new Gestion();
        int cc = Integer.parseInt(JOptionPane.showInputDialog("Cedula"));
        int idBarbero;
        int idServicio;
        try {
            if (valida.validarExistencia(cc, "clientes.txt")) {
                idBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Brayan: 8:00am - 12:00pm \n 2-Deivy: 12:00pm - 4:00pm \n 3-Santiago:4:00pm - 8:00pm \n\n\n\n"));

                JOptionPane.showMessageDialog(null, "voy a listar ");
                String texto = admin.listarServicio();
                idServicio = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
                ModuloReserva modulo1 = new ModuloReserva();
                modulo1.agregarReserva(idServicio, cc, idBarbero);
            } else {
                cliente.setId(cc);
                cliente.setNombre(JOptionPane.showInputDialog("Nombre: "));
                cliente.setTelefono(JOptionPane.showInputDialog("Telefono: "));
                mFile.createRegistro("clientes.txt", cliente);

                idBarbero = Integer.parseInt(JOptionPane.showInputDialog(null, "**************BARBER-YORK***************  \n \n\n1-Brayan: 8:00am - 12:00pm \n 2-Deivy: 12:00pm - 4:00pm \n 3-Santiago:4:00pm - 8:00pm \n\n\n\n"));
                JOptionPane.showMessageDialog(null, "voy a listar ");

                String texto = admin.listarServicio();

                idServicio = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
                ModuloReserva modulo2 = new ModuloReserva();
                modulo2.agregarReserva(idServicio, cc, idBarbero);
            }
        } catch (Exception e) {
        }
        menuPrincipal();

    }

    public void eliminarReserva() {
        int id = (Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su cedula para eliminar  ")));
        ManejoArchivo eliminar = new ManejoArchivo();
        eliminar.eliminarRegistro(id, "clientes.txt");
    }

}
