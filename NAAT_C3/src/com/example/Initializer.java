package com.example;

public class Initializer {

    // Otras banderas... %f %d
    static String banner = "Bienvenido al modelo %s, con direccion %s.";
    static String phrase = "La vida es ella... <3";
    static String sampleEmails = "test@example.com,test@example.com";

    public static void main(String [] args){

        String year = "2020";
        String lote = "035";
        StringBuilder sb = new StringBuilder(phrase);
        String sujeto = sb.substring(0,7);
        String predicado = sb.substring(9,18); //sb.substring(9);
        String verbo = sb.substring(9,11);
        StringBuilder phrase2 = sb.insert(11,"una cerveza con ");
        String phrase2O = phrase2.toString();
        StringBuilder drunk = phrase2.reverse();
        String mirror = drunk.append(phrase2O).toString();
        System.out.println(mirror);

        MobileDevice mobileDevice = new MobileDevice(45646456,"0A:8G:9F:2Q");

        try {

            System.out.println(String.format(banner, mobileDevice.model, mobileDevice.macAddress));
            System.out.println("Longitud del modelo: " + mobileDevice.model.length());
            String[] parts = mobileDevice.macAddress.split(":");
            String[] emails = sampleEmails.split(",");

            if (mobileDevice.model.startsWith(year)) {
                System.out.println("Modelo actual.");
            } else {
                System.out.println("Renueva tu dispositivo.");
            }

            if (mobileDevice.model.endsWith(lote)) {
                System.out.println("El lote esta controlado.");
            } else {
                System.out.println("Lote pendiente de supervision.");
            }

            System.out.println("Se enviara notificacion de error a: ");

            for (int i = 0; i < emails.length; i++) {
                System.out.println(emails[i]);
            }

            for (String e : emails) {
                System.out.println(e);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
            //e.setStackTrace();
        }

    }

}
