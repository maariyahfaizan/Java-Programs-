package ques_4_and_5;

public class NewMain {

    public static void main(String[] args) {
        System.out.println("For Java:");
        JavaLanguage j = new JavaLanguage();
        j.abstraction();
        j.inheritance();
        j.polymorphism();
        j.interfaces();
        j.persistence();
        System.out.println("For C++:");
        Cpp c = new Cpp();
        c.abstraction();
        c.inheritance();
        c.polymorphism();
        c.template();
        c.friendFunction();
    }
    
}
