package ques8;

public class Refrigerator extends Appliance{
    void turnOn(){
        System.out.println("Turning on Refrigerator");
    }
    
    void turnOff(){
        System.out.println("Turning off Refrigerator");
    }

    public Refrigerator(String brand, double power) {
        super(brand, power);
    }
    
}
