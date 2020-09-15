package mx.com.naat.naachat.Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread{

    int puerto = 0;
    ServerSocket servidor;
    Socket cliente;

    public Servidor(int puerto){
        this.puerto = puerto;
    }

    @Override
    public void run() {
        super.run();
        try {
            servidor = new ServerSocket(puerto);
            while (true){

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        cliente = new Socket();
    }
}
