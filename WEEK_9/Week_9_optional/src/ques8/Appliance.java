package ques8;

abstract public class Appliance {
    String brand;
    double power;
    
    abstract void turnOn();
    abstract void turnOff();

    public Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }
    
}
