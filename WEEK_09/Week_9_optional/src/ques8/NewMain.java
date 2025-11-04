package ques8;

public class NewMain {

    public static void main(String[] args) {
        WashingMachine w = new WashingMachine("LG",2.4);
        w.turnOn();
        w.turnOff();
        Refrigerator r = new Refrigerator("VideoCom",19);
        r.turnOn();
        r.turnOff();
    }
    
}
