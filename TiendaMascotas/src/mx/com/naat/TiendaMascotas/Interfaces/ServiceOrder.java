package mx.com.naat.TiendaMascotas.Interfaces;

import java.time.LocalDateTime;

public interface ServiceOrder {

    String customer = "";

    String order = "";

    LocalDateTime date = null;

    public boolean sendOrder ();

}
