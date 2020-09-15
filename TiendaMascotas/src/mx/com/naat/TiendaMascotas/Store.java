
package mx.com.naat.TiendaMascotas;

/*
* Ejercicio No. 2 basado en el ejercicio anterior, interfaces y creacion de clases.
* Modulo Fundamentos de JAVA
* */

import mx.com.naat.TiendaMascotas.Interfaces.ServiceOrder;

public class Store {

    public static void main(String [] args){
        System.out.println("Bienvenido a la tienda ");
    }

    public String getSupport(){
        ServiceOrder serviceOrder = new ServiceOrder() {
            @Override
            public boolean sendOrder(ServiceTickets st) {
                st.saveRow(); // Request.post("comment")
                return false;
            }
        };
        return null;
    }

    public String getHome(){
        Stock s = new Stock();
        return null;
    }

}
