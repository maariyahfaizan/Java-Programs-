/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_1;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("Enter second coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance= Math.pow((x1-x2),2) + Math.pow((y1-y2),2);
        System.out.println("Distance = " + Math.sqrt(distance));
        
    }
    
}
