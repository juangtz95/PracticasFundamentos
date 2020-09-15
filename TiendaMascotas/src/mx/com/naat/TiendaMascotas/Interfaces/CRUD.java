package mx.com.naat.TiendaMascotas.Interfaces;

/*
 * Ejercicio No. 2 basado en el ejercicio anterior, interfaces y creacion de clases.
 * Modulo Fundamentos de JAVA
 * */

import java.lang.reflect.Array;

public interface CRUD {

    Array fields = null;
    String table = "";
    String identificador = "id";

    public String getField(String field, String col, String comp, String valor);
    public String getField(String col, String valorId);
    public String getField(String query);

    public Object getRow();

    public Object updateRow();

    public boolean deleteRow();

}
