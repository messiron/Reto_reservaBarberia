
package com.mycompany.barberia;

import java.io.Serializable;


public class Reserva implements Serializable{
  int id;
  String estado;
  Servicio servicio;
  Cliente cliente;
  private Barbero barbero;

    public Reserva() {
    }

    public Reserva(int id, String estado, Servicio servicio, Cliente cliente, Barbero barbero) {
        this.id = id;
        this.estado = estado;
        this.servicio = servicio;
        this.cliente = cliente;
        this.barbero = barbero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
