package mx.com.naat.naachat.Vista;

import java.util.Date;

public class Mensaje {
    String Mensaje = "";
    Date hora;

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

}
