
package com.mycompany.barberia;

import java.io.Serializable;


public class Cliente extends Persona implements Serializable{
    private static final long serialVersionUID= 1L;
    
   String numeroCliente;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String telefono, String direccion, int id, int edad) {
        super(nombre, telefono, direccion, id, edad);
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    
}
