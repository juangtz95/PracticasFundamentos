
public class todoJunto {
    public int azucar=150;
    public int elote=80;
    public int harina=200;
    public int relleno=80;
    public int cositas= 538;
    public  void  todoJunto(int azucar,int elote,int harina,int relleno){
        this.azucar= azucar;
        this.elote=elote;
        this.harina=harina;
        this.relleno=relleno;
    }
    public boolean agregar(int azucar,int elote,int harina,int relleno){
        if( azucar==150 && elote==80 && harina==200 && relleno==80){
            return  true;
        }else{
            return  false;
        }
    }

    public int getCositas() {

        return cositas;
    }


}
