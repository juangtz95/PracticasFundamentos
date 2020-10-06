
package mx.com.naat.Controlador;

import java.util.List;
import mx.com.naat.POJO.ClienteR;
import mx.com.naat.POJO.HabitacionR;
import mx.com.naat.POJO.ReservacionR;

/**
 *
 * Simulacion de la conexion a la base de datos, manejo de arreglos de las clases.
 * @author Juan de Dios Gutierrez
 * 
 */
public class HotelDB {
    
    private List<ClienteR> clientes;
    private List<HabitacionR> habitaciones;
    private List<ReservacionR> reservacions;
    
    /*
        * Lista de clientes obtener.
    */
    public List<ClienteR> getClientes() {
        return clientes;
    }
    
    /*
        * @param Lista de clientes guardar.
    */
    public void setClientes(List<ClienteR> clientes) {
        this.clientes = clientes;
    }
    
    /*
        * @param Lista de habitacion obtener.
    */
    public List<HabitacionR> getHabitaciones() {
        return habitaciones;
    }
    
    /*
        * @param Lista de habitaciones guardar.
    */
    public void setHabitaciones(List<HabitacionR> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
    /*
        * @param Lista de reservacion obtener.
    */
    public List<ReservacionR> getReservacions() {
        return reservacions;
    }
    
    /*
        * @param Lista de reservaciones guardar.
    */
    public void setReservacions(List<ReservacionR> reservacions) {
        this.reservacions = reservacions;
    }
    
}
