package ques9;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD = "+ MathOp.findGCD(a,b));
        System.out.println("LCM = " + MathOp.findLCM(a,b));
    }
    
}
