package week_3_optional;

import java.util.Scanner;

public class Celcius_Fahrenheit {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter temperature in Celsius: ");
        double c=sc.nextDouble();
        double f=((9.0/5.0)*c)+32;
        System.out.println("Temperature in Fahrenheit is " + f);
    }
}
