
package mx.com.naat.TiendaMascotas.Interfaces;

/*
 * Ejercicio No. 2 basado en el ejercicio anterior, interfaces y creacion de clases.
 * Modulo Fundamentos de JAVA
 * Define las tres operaciones basicas comunes para cualquier transaccion de la tienda.
 * */

public interface Transaction{

    public double comprar(double total);

    public double vender(double total);

    public double devolver(double total);

}
