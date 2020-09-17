public class Rebanar {

    private int numeroPanes=0;

    public Rebanar(int numeroPanes) {
        this.numeroPanes = numeroPanes;
    }

    public boolean rebanarPanes(){
        Double cortar=Math.random()*8;
        numeroPanes = Integer.parseInt(cortar.toString());
        //El pan se debe cortar en 8 rebanadas para pasar al empaquetado
        if (numeroPanes==8) return false;
        return true;
    }


    public int getNumeroPanes() {
        return numeroPanes;
    }

    public void setNumeroPanes(int numeroPanes) {
        this.numeroPanes = numeroPanes;
    }
}
