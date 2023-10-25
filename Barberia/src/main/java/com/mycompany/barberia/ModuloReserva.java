
package com.mycompany.barberia;

import javax.swing.*;


public class ModuloReserva {
        
    public void agregarReserva(int idServicio, int idCliente, int idBarbero) {
          Busqueda busqueda = new Busqueda();
    Barbero barbero = new Barbero();
    Cliente cliente = new Cliente();
    Servicio servicio = new Servicio();

        ManipularReserva manipular = new ManipularReserva();       
        servicio = busqueda.buscarServicio(idServicio);
        cliente = busqueda.buscarCliente(idCliente);
        barbero = busqueda.buscarBarbero(idBarbero);
        int idReserva = Integer.parseInt(JOptionPane.showInputDialog("ingrese id reserva"));
        Reserva reserva = new Reserva(idReserva, "pendiente", servicio, cliente, barbero);
       manipular.createRegistro(reserva);
        

    }
}