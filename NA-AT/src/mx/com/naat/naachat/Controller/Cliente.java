package mx.com.naat.naachat.Controller;

import java.io.IOException;
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
            while(true){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
