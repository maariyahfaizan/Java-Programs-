package ques8;

public class WashingMachine extends Appliance{
    void turnOn(){
        System.out.println("Turning on washing machine");
    }
    
    void turnOff(){
        System.out.println("Turning off washing machine");
    }

    public WashingMachine(String brand, double power) {
        super(brand, power);
    }
    
}
