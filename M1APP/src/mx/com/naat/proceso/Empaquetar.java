public class Empaquetar {
    private int panes;
    private int paquetes;
    public void Empaquetar(int p){
        panes = p;
    }

    public boolean envolver(){
        paquetes = (int) (Math.random()*20);
        if(paquetes >= 1)
            return true;
        else
            return false;
    }

    public int getPaquetes(){
        return paquetes;
    }
}
