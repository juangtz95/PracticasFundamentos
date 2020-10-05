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
public class Cliente{
    
    private String nombre;
    private boolean miembro;
    private String tarjetaNo;
    private String correo;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, boolean miembro, String tarjetaNo, String correo) {
        this.nombre = nombre;
        this.miembro = miembro;
        this.tarjetaNo = tarjetaNo;
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMiembro() {
        return miembro;
    }

    public void setMiembro(boolean miembro) {
        this.miembro = miembro;
    }

    public String getTarjetaNo() {
        return tarjetaNo;
    }

    public void setTarjetaNo(String tarjetaNo) {
        this.tarjetaNo = tarjetaNo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
