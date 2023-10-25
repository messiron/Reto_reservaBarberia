
package com.mycompany.barberia;


public class GestionReserva {
    Cliente clienteRese;
    Servicio servicioRese;
    Barbero barberoRese;
    Busqueda busquedaRese;
    public void crearObjetoReser (int idCliente,int idServicio, int idBarbero){
        clienteRese = busquedaRese.buscarCliente(idCliente);
        servicioRese = busquedaRese.buscarServicio(idServicio);
        barberoRese = busquedaRese.buscarBarbero(idBarbero);
        Reserva nuevaReserva = new Reserva (idBarbero,"Pendiente", servicioRese, clienteRese, barberoRese);
    }
}
