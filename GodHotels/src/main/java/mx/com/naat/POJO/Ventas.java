/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.naat.POJO;

import mx.com.naat.Controlador.Calcular;

/**
 *
 * @author mbpro-198
 */
public class Ventas {
    
    private Cliente cliente;
    private Reservacion reservacion;
    private Calcular calcular;
    
    public Ventas(){
        
    }
    
    public Ventas(Cliente cliente, Reservacion reservacion, Calcular calcular) {
        this.cliente = cliente;
        this.reservacion = reservacion;
        this.calcular = calcular;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Calcular getCalcular() {
        return calcular;
    }

    public void setCalcular(Calcular calcular) {
        this.calcular = calcular;
    }
    
}
