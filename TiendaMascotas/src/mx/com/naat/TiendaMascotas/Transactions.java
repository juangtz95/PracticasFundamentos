
package mx.com.naat.TiendaMascotas;
import mx.com.naat.TiendaMascotas.Filters.Validations;
import mx.com.naat.TiendaMascotas.Interfaces.Transaction;

/*
 * Ejercicio No. 2 basado en el ejercicio anterior, interfaces y creacion de clases.
 * Modulo Fundamentos de JAVA
 * */

public class Transactions extends Validations implements Transaction{

    @Override
    public double comprar(double total) {
        return 0;
    }

    @Override
    public double vender(double total) {
        return 0;
    }

    @Override
    public double devolver(double total) {
        return 0;
    }

}
