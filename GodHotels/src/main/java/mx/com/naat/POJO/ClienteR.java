
package mx.com.naat.POJO;

/**
 * Clase ClienteR con todos sus atributos.
 * @author Juan de Dios Gutierrez
 */
public class ClienteR{
    
    private String nombre;
    private boolean miembro;
    private String tarjetaNo;
    private String correo;
    
    public ClienteR(){
        
    }
    
    public ClienteR(String nombre, boolean miembro, String tarjetaNo, String correo) {
        this.nombre = nombre;
        this.miembro = miembro;
        this.tarjetaNo = tarjetaNo;
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMiembro() {
        return miembro;
    }

    public void setMiembro(boolean miembro) {
        this.miembro = miembro;
    }

    public String getTarjetaNo() {
        return tarjetaNo;
    }

    public void setTarjetaNo(String tarjetaNo) {
        this.tarjetaNo = tarjetaNo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
