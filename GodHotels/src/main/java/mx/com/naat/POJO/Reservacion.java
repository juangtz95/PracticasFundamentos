/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.naat.POJO;

/**
 *
 * @author mbpro-198
 */
public class Reservacion{
    
    private int noCuartos;
    private int dias;
    private boolean comida;
    private Habitacion habitacion;
    
    public Reservacion() {
        
    }
    
    public Reservacion(int noCuartos, Habitacion habitacion, int dias, boolean comida) {
        this.noCuartos = noCuartos;
        this.dias = dias;
        this.comida = comida;
    }

    public int getNoCuartos() {
        return noCuartos;
    }

    public void setNoCuartos(int noCuartos) {
        this.noCuartos = noCuartos;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }
    
}
