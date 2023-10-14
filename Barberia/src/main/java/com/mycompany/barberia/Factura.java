
package com.mycompany.barberia;

import java.io.Serializable;


public class Factura implements Serializable{
      private static final long serialVersionUID= 1L;
    String nombre, apellido;
    int idFactura,idCliente;
    double precio;

    public Factura() {
    }

    public Factura(String nombre, String apellido, int idFactura, int idCliente, double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idFactura = idFactura;
        this.idCliente = idCliente;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
