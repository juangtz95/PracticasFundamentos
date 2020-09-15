package mx.com.naat.naachat.Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Cliente extends Thread{

    String ipremitente = "";
    int puertodestino = 0;
    private Socket cliente;

    public Cliente(String ipremitente, int puertodestino){
        this.ipremitente = ipremitente;
        this.puertodestino = puertodestino;
    }

    public void setIpremitente(String ipremitente) {
        this.ipremitente = ipremitente;
    }

    public void setPuertodestino(int puertodestino) {
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
