
package com.mycompany.barberia;

import java.io.Serializable;


public class Cita implements Serializable{
      private static final long serialVersionUID= 1L;
    String fecha,hora;

    public Cita() {
    }

    public Cita(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
}
