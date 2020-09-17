package com.example;

public class Device {

    public String model;
    public int identifier;
    public String macAddress;

    public Device(){
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

}
