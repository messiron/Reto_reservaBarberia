
package com.mycompany.barberia;


public class Reserva {
  Servicio servicio;
  Cliente cliente;
  Barbero barbero;

    public Reserva() {
    }

    public Reserva(Servicio servicio, Cliente cliente, Barbero barbero) {
        this.servicio = servicio;
        this.cliente = cliente;
        this.barbero = barbero;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Barbero getBarbero() {
        return barbero;
    }

    public void setBarbero(Barbero barbero) {
        this.barbero = barbero;
    }
 
}
