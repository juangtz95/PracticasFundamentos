import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ControladorC implements Runnable{

    private String ip;
    private int puerto;
    private Mensaje mensaje;

    public ControladorC(String ip, int puerto, Mensaje mensaje){
        this.ip=ip;
        this.puerto=puerto;
        this.mensaje=mensaje;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getIp() {
        return ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public Mensaje getMensaje() {
        return mensaje;
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        //Puerto del servidor
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, puerto);

            ObjectOutputStream outs = new ObjectOutputStream(sc.getOutputStream());
            outs.writeObject(mensaje);
            outs.flush();
            sc.close();

        } catch (IOException ex) {
            System.out.println("Fallo"+ex);
        }

    }
}
