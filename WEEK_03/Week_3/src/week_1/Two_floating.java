/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_1;
import java.util.Scanner;

public class Two_floating {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two float numbers: ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double product= n1*n2;
        System.out.println("Product of "+ n1 + " and " + n2 + " is " + product);
    }
    
}
