/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.naat.uno;

import mx.com.naat.DAO.Cliente;
import mx.com.naat.POJO.ClienteR;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author mbpro-198
 */
public class ClienteTest {

    Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente();
        cliente.getConectar();
    }

    @AfterEach
    public void cerrarTodo() {
        cliente = null;
    }

    @Test
    public void agregarCliente() {
        cliente.listCliente();
        ClienteR clienteR =
                new ClienteR("Saul",true,"0110359201103596","naat@example.com");
        assertTrue(cliente.agregar(clienteR));
        cliente.guardarLista();
    }
    
    @Test
    public void mostrarCliente() {
        cliente.listaDB();
        assertTrue(cliente.buscarTodos());
    }
    
}
