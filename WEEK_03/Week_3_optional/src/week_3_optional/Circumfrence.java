/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_3_optional;

import java.util.Scanner;

public class Circumfrence {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter radius: ");
        double r= sc.nextDouble();
        double c= 2*Math.PI*r;
        System.out.println("Circumference = " + c);
    }
}
