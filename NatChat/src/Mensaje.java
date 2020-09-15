import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable {
    private String Texto;
    private Date fecha;
    private String Nombre;

    public Mensaje(String Texto,String Nombre){
        this.Texto=Texto;
        this.Nombre=Nombre;
        fecha= new Date();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTexto() {
        return Texto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }
}
