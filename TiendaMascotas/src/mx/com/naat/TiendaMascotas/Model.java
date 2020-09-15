package mx.com.naat.TiendaMascotas;

import mx.com.naat.TiendaMascotas.Interfaces.CRUD;

import java.lang.reflect.Array;

public class Model implements CRUD {

    @Override
    public Object getField(String field, String col, String comp, String valor) {
        return null;
    }

    @Override
    public Object getField(String col, String valorId) {
        return null;
    }

    @Override
    public Object getField(String query) {
        return null;
    }

    @Override
    public Object getRow(String valorDeId) {
        return null;
    }

    @Override
    public Array getResults(String query) {
        return null;
    }

    @Override
    public boolean saveRow() {
        return false;
    }

    @Override
    public Object updateRow() {
        return null;
    }

    @Override
    public boolean deleteRow() {
        return false;
    }
    
}
