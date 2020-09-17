package com.example;

public class Initializer {

    // Otras banderas... %f %d
    static String  banner = "Bienvenido al modelo %s, con direccion %s.";

    public static void main(String [] args){

        String year = "2020";
        String lote = "035";

        MobileDevice mobileDevice = new MobileDevice();
        System.out.println(String.format(banner, mobileDevice.model, mobileDevice.macAddress));
        System.out.println("Longitud del modelo: " + mobileDevice.model.length());
        String[] parts = mobileDevice.macAddress.split(":");

        if(mobileDevice.model.startsWith(year)){
            System.out.println("Modelo actual.");
        } else {
            System.out.println("Renueva tu dispositivo.");
        }

        if(mobileDevice.model.endsWith(lote)){
            System.out.println("El lote esta controlado.");
        } else {
            System.out.println("Lote pendiente de supervision.");
        }

    }

}
