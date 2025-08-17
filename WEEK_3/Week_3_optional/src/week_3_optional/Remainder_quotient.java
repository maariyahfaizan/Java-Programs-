/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_3_optional;
import java.util.Scanner;
 class Remainder_quotient {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two integer values: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Reaminder = " + (n1%n2) + " and Quotient = " + (n1/n2));
    }
    
}
