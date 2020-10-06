/*
 *
 */
package mx.com.naat.DAO;

import java.util.ArrayList;
import java.util.List;
import mx.com.naat.Controlador.HotelDB;
import mx.com.naat.POJO.ClienteR;

/**
 *
 * @author Juan de Dios Gutierrez
 */
public class Cliente implements CRUD{
    
    private List<ClienteR> lista;
    private HotelDB hotelDB;
    
    public boolean getConectar(){
        hotelDB = new HotelDB();
        if(hotelDB != null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void listCliente(){
        //this.lista = hotelDB.getClientes();
        this.lista = new ArrayList<ClienteR>();
    }
    
    public void listaDB(){
        this.lista = hotelDB.getClientes();
    }
    
    public void guardarLista(){
        hotelDB.setClientes(lista);
    }
    
    @Override
    public boolean agregar(Object o) {
        if(!((ClienteR)o).getCorreo().isEmpty() && !((ClienteR)o).getNombre().isEmpty() &&
                !((ClienteR)o).getTarjetaNo().isEmpty() && ((ClienteR)o).getTarjetaNo().length() == 16){
            lista.add((ClienteR)o);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean buscarTodos() {
        if(lista.isEmpty()){
            return false;
        }else{
            for(ClienteR e:lista){
                System.out.println("Nombre: " + e.getNombre() + " No. Tarjeta: " + e.getTarjetaNo() 
                        + " Membresia: " + e.isMiembro() + " Correo: " + e.getCorreo());
            }
            return true;
        }
    }

    @Override
    public boolean buscarPorId(int id) {
        if(lista.get(id) != null && id < lista.size()){
            ClienteR clienter = lista.get(id);
            System.out.println("Nombre: " + clienter.getNombre() + " No. Tarjeta: " + clienter.getTarjetaNo() 
                        + " Membresia: " + clienter.isMiembro() + " Correo: " + clienter.getCorreo());
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean elimarTodos() {
        lista.clear();
        if(lista.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean elimarPorId(int id) {
        if(lista.get(id) != null && id < lista.size()){
           lista.remove(id);
           return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean modificar(Object a,Object m) {
        if(lista.contains((ClienteR)a)){
            lista.set(lista.indexOf(((ClienteR)a)),((ClienteR)m));
            return true;
        } else {
            return false;
        }
    }
    
}
