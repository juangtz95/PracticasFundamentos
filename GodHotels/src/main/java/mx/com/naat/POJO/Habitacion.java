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
public class Habitacion {
    
    private double precio;
    private int capacidad;
    private int idHabitacion;
    private int camas;
    private boolean jacuzzi;
    private boolean rentado;

    public Habitacion(double precio, int capacidad, int idHabitacion, int camas, boolean jacuzzi, boolean rentado) {
        this.precio = precio;
        this.capacidad = capacidad;
        this.idHabitacion = idHabitacion;
        this.camas = camas;
        this.jacuzzi = jacuzzi;
        this.rentado = rentado;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }
    
}
