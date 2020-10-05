/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.naat.DAO;

/**
 *
 * @author mbpro-198
 */
public interface CRUD {
    
    public boolean agregar(Object o);
    public boolean buscarTodos();
    public boolean buscarPorId(int id);
    public boolean elimarTodos();
    public boolean elimarPorId(int id);
    public boolean modificar(Object o);
    
}
