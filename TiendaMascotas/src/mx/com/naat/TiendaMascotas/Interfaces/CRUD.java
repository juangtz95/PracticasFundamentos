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

    //Select campo from tabla where columna comparador valor limit 1
    public Object getField(String field, String col, String comp, String valor);

    //Select campo from tabla where identificador = valorId
    public Object getField(String col, String valorId);

    //Query (select agregate... from table join left right having etc...
    public Object getField(String query);

    public Object getRow(String valorDeId);

    public Array getResults(String query);

    public boolean saveRow();

    public Object updateRow();

    public boolean deleteRow();

}
