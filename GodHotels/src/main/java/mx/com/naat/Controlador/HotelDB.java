
package mx.com.naat.Controlador;

import java.util.List;
import mx.com.naat.POJO.Cliente;
import mx.com.naat.POJO.Habitacion;
import mx.com.naat.POJO.Reservacion;

/**
 *
 * Simulacion de la conexion a la base de datos, manejo de arreglos de las clases.
 * @author Juan de Dios Gutierrez
 * 
 */
public class HotelDB {
    
    private List<Cliente> clientes;
    private List<Habitacion> habitaciones;
    private List<Reservacion> reservacions;
    
    /*
        * Lista de clientes obtener.
    */
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    /*
        * @param Lista de clientes guardar.
    */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    /*
        * @param Lista de habitacion obtener.
    */
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    /*
        * @param Lista de habitaciones guardar.
    */
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
    /*
        * @param Lista de reservacion obtener.
    */
    public List<Reservacion> getReservacions() {
        return reservacions;
    }
    
    /*
        * @param Lista de reservaciones guardar.
    */
    public void setReservacions(List<Reservacion> reservacions) {
        this.reservacions = reservacions;
    }
    
}
