package mx.com.naat.proceso;

public class Revolver {

    private boolean masa;
    private int tiempo;
    private boolean esponjosa;
    private boolean mezcla;
    int peso;

    public boolean getMasa() {
        return masa;
    }

    public void setMasa(boolean masa) {
        this.masa = masa;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isEsponjosa() {
        return esponjosa;
    }

    public void getEsponjosa(boolean esponjosa) {
        this.esponjosa = esponjosa;
    }

    private void revolverMasa(int peso, boolean lista){
        if(peso != 0 && lista == true){
            for(int i = 0 ; i < 30 ; i++)
                System.out.println("Espere un momento revolviendo la masa...");
            mezcla = true;
        } else {
            mezcla = false;
        }
    }

    public int masaTerminada(){
        if(mezcla == true){
            //peso enviado por todo junto
        } else{
            System.out.println("La masa no ha sido terminada, espera un poco mas.");
        }
        return peso;
    }

    public boolean getEsponjoso(){
        boolean terminado = false;
        if(tiempo == 30){
            terminado = true;
        } else {
            System.out.println("La masa no ha sido terminada, espera un poco mas.");
        }
        return terminado;
    }
}
