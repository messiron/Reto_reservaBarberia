
package com.mycompany.barberia;

import java.io.Serializable;


public class Barbero extends Persona implements Serializable {
      private static final long serialVersionUID= 1L;
    private String especialidad;

    public Barbero() {
    }
    
    

    public Barbero(String especialidad, String nombre, String telefono, String direccion, int id, int edad) {
        super(nombre, telefono, direccion, id, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
