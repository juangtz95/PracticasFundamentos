package mx.com.naat.naachat.Vista;

public class Usuario {

    String nombre = "";
    String apellido = "";
    String puerto = "";


    public static void main (String [] args){

        Mensaje mensaje = new Mensaje();
        String usuario = "";

        if(usuario.equals("server")){
            mensaje = new Mensaje();
            mensaje.setMensaje("Prueba 1...");
        } else if(usuario.equals("client")){

        }

    }

    public boolean enviarMensaje(){
        return true;
    }

    public boolean recibirMensaje(){
        return false;
    }

}
