/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_1;

import java.util.Scanner;


public class ADDING_TWO {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum= n1+n2;
        System.out.println("Sum of "+ n1 + " and " + n2 + " is " + sum);
    }
    
}
