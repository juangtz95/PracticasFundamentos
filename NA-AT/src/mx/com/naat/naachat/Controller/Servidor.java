package mx.com.naat.naachat.Controller;

import mx.com.naat.naachat.Vista.Mensaje;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{

    int puerto = 0;
    ServerSocket servidor;
    Socket cliente;
    Mensaje mensaje = new Mensaje();

    public Servidor(int puerto){
        this.puerto = puerto;
    }

    public void setMensaje(Mensaje mensaje){
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        super.run();
        try {
            servidor = new ServerSocket(puerto);
            while (true){
                cliente = new Socket();
                System.out.println("Esperando al usuario...");
                if(servidor.accept()!= null)System.out.println("Usuario conectado...");
                ObjectOutputStream envio = new ObjectOutputStream(cliente.getOutputStream());
                envio.writeObject(mensaje);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        cliente = new Socket();
    }
}
