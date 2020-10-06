/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.naat.DAO;

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
        this.lista = hotelDB.getClientes();
    }
    
    @Override
    public boolean agregar(Object o) {
        if(((ClienteR)o).getCorreo() != "" && ((ClienteR)o).getNombre() != "" &&
                ((ClienteR)o).getTarjetaNo() != ""){
            lista.add((ClienteR)o);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean elimarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
