
package com.mycompany.barberia;

import java.io.Serializable;


public class Persona implements Serializable {
      private static final long serialVersionUID= 1L;
    String nombre;
    String telefono;
    String direccion;
    int id, edad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String direccion, int id, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
