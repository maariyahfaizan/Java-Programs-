package ques7;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dept, name, and salary of manager: ");
        Manager m = new Manager(sc.nextLine(),sc.nextLine(),sc.nextDouble());
        m.details();
    }
    
}
