package mx.com.naat.naachat.Vista;

import java.util.Date;

public class Mensaje {

    String mensaje = "";
    String hora;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        mensaje = mensaje;
    }

    public void setHora() {
        this.hora = new Date().toString();
    }

}
