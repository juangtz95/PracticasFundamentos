package pan.delivery;

public class Delivery {

    public int paquetes;

    public String formaDeEnvio(int paquetes) {
        if (paquetes <= 3) {
            System.out.println("Se envia en bici");
            String bici = "bici";
            return bici;
        } else {
            System.out.println("Se envia en uberEats");
            String uber = "uberEats";
            return uber;
        }
    }

    public void enviar() {
        String tipoEnvio = formaDeEnvio(3);
        if (tipoEnvio == "uberEats") {
            System.out.println("Entregar a conductor");
        } else {
            System.out.println("Entregar a repartidor de bici");
        }
    }


    /*
    public String entregar() {
        if(entregado) {
            String entregado = "Ya llego"
            return entregado
        }

    }

    public void cobrar() {
        if(entregado) {
            System.out.println("Cobrar dinero");
        }
    }

     */
}
