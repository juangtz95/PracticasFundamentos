package mx.com.naat.naachat.Vista;

import mx.com.naat.naachat.Controller.Cliente;
import mx.com.naat.naachat.Controller.Servidor;

public class Usuario {

    String nombre = "";
    String apellido = "";
    String puerto = "";


    public static void main (String [] args){

        Mensaje mensaje = new Mensaje();
        String usuario = "server";
        Servidor server = new Servidor(9000);
        Cliente cliente = new Cliente("localhost",9000);
        if(usuario.equals("server")){
            server.run();
            mensaje = new Mensaje();
            mensaje.setMensaje("Prueba 1...");

        } else if(usuario.equals("client")){
            cliente.run();
        }

    }

    public boolean enviarMensaje(){
        return true;
    }

    public boolean recibirMensaje(){
        return false;
    }

}
