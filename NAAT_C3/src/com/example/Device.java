package com.example;

public class Device {

    public String model;
    public int identifier;
    public String macAddress;

    public Device(String m, int i, String a){
        model = m;
        identifier = i;
        macAddress = a;
        turnOn();
        loadOS();
    }

    public void turnOn(){
        System.out.println("Device turned on...");
    }

    public void turnOff(){
        System.out.println("Device turned off...");
    }

    public void loadOS(){
        System.out.println("Carga de recursos del sistema...");
    }

    /*
    public void getProducts(int param){}
    public void getProducts(int param, int param1){}
    public void getProducts(int param, int param1, int param2){}
    public void getProducts(int param, int param1, int param2, int param3){}
    public void getRealProducts(){}
    */

    //var args
    public void getProducts(int ...params) {
        /*
        * nombres[0] = clientes
        * nombres[1] = Supervisores
        * nombres[2] = Gerentes
        * */
    }

}
