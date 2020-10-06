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
public class VentasR {
    
    private ClienteR cliente;
    private ReservacionR reservacion;
    private Calcular calcular;
    
    public VentasR(){
        
    }
    
    public VentasR(ClienteR cliente, ReservacionR reservacion, Calcular calcular) {
        this.cliente = cliente;
        this.reservacion = reservacion;
        this.calcular = calcular;
    }

    public ClienteR getCliente() {
        return cliente;
    }

    public void setCliente(ClienteR cliente) {
        this.cliente = cliente;
    }

    public ReservacionR getReservacion() {
        return reservacion;
    }

    public void setReservacion(ReservacionR reservacion) {
        this.reservacion = reservacion;
    }

    public Calcular getCalcular() {
        return calcular;
    }

    public void setCalcular(Calcular calcular) {
        this.calcular = calcular;
    }
    
}
