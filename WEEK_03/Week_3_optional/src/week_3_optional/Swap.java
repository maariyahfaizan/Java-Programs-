/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_3_optional;

import java.util.Scanner;


public class Swap {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two integer numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Before swapping n1 = " + n1 + " and n2 = " + n2);
        int temp= n1;
        n1=n2;
        n2=temp;
        System.out.println("After swapping n1 = " + n1 + " and n2 = " + n2);
    }
    
}
