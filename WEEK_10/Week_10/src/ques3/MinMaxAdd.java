package ques3;
import java.util.Scanner;

public class MinMaxAdd {
    static void minMaxAdd (int a,int b,int c){
        int min;
        int max;
        if (a<b){
            if (a<c)
                min=a;
            else
                min=c;
        }
        else {
            if (b<c)
                min=b;
            else
                min=c;
        }
        if (a>b){
            if (a>c)
                max=a;
            else
                max=c;
        }
        else {
            if (b>c)
                max=b;
            else
                max=c;
        }
        int sum=a+b+c;
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        
    }
    
    static void minMaxAdd (double a,double b,double c){
        double min;
        double max;
        if (a<b){
            if (a<c)
                min=a;
            else
                min=c;
        }
        else {
            if (b<c)
                min=b;
            else
                min=c;
        }
        if (a>b){
            if (a>c)
                max=a;
            else
                max=c;
        }
        else {
            if (b>c)
                max=b;
            else
                max=c;
        }
        double sum=a+b+c;
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        
    }
    
    static void minMaxAdd (char a,char b,char c){
        char min;
        char max;
        if (a<b){
            if (a<c)
                min=a;
            else
                min=c;
        }
        else {
            if (b<c)
                min=b;
            else
                min=c;
        }
        if (a>b){
            if (a>c)
                max=a;
            else
                max=c;
        }
        else {
            if (b>c)
                max=b;
            else
                max=c;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + a+b+c);
        
    }
    
    
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);
        System.out.println("Enter three integers: ");
        minMaxAdd(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Enter three real numbers: ");
        minMaxAdd(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.println("Enter three characters: ");
        minMaxAdd(sc.next().charAt(0),sc.next().charAt(0),sc.next().charAt(0));
    }
}
