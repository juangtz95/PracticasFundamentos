/*
* Ejercicio uno conexion server cliente para un pequeño chat.
*/

public class Usuario {
    private String Name;
    private String Apellidos;
    private String IP;

    public static void main(String[] args) {
        /*Mensaje men= new Mensaje("Salu2","Plata");
        ControladorC cc= new ControladorC("127.0.0.1",9000,men);
        cc.run();*/
        ControladorS cs= new ControladorS(9001);
        cs.run();


    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getIP() {
        return IP;
    }

    public String getName() {
        return Name;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setName(String name) {
        Name = name;
    }
}
