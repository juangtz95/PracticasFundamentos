/*
* Ejercicio uno controlador client para la  conexion server cliente para un pequeño chat.
*/

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ControladorS implements Runnable{

    private int puerto;

    public ControladorS(int puerto){
        this.puerto=puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public int getPuerto() {
        return puerto;
    }

    @Override
    public void run() {
        ServerSocket servidor = null;
        Socket sc = null;
        ObjectInputStream in;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Cliente conectado");
                in = new ObjectInputStream(sc.getInputStream());

                //Leo el mensaje que me envia
                Mensaje mensaje = (Mensaje) in.readObject();

                System.out.println(mensaje.getTexto());

                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Fallo"+ex);
        }


    }
}
