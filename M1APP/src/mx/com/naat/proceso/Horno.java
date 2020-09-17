import java.lang.Math;
public class Horno {
    private int Revoltura;
    private int Molde;

    public Horno(int r){
        Revoltura=r;
    }

    public boolean temp(){
        Double t=Math.random()*50;
            if (t<20) return false;
        return true;
    }
    
    public int getMolde() {
        Molde=Revoltura/10;
        return Molde;
    }

}
