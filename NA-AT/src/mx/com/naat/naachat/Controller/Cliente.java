package mx.com.naat.naachat.Controller;

import mx.com.naat.naachat.Vista.Mensaje;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente extends Thread{

    private String ipremitente = "";
    private int puertodestino = 0;
    private Socket cliente;

    public Cliente(String ipremitente, int puertodestino){
        this.ipremitente = ipremitente;
        this.puertodestino = puertodestino;
    }

    @Override
    public void run() {
        super.run();
        try {
            cliente = new Socket(ipremitente,puertodestino);
                ObjectInputStream objetorecibir = new ObjectInputStream(cliente.getInputStream());
                Mensaje mensaje = (Mensaje) objetorecibir.readObject();
                System.out.println("Datos: " + mensaje.getMensaje());
                objetorecibir.close();
                cliente.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
