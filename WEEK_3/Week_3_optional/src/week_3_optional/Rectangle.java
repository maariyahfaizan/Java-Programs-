/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_3_optional;

import java.util.Scanner;


public class Rectangle {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter length and breadth: ");
       double length=sc.nextDouble();
       double breadth=sc.nextDouble();
       double area=length*breadth;
        System.out.println("Area of rectangle = " + area);
    }
}
