package week_1;


import java.util.Scanner;
public class Avg {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        double avg = (n1+n2+n3)/3.0;
        System.out.println("Average = " + avg);
    }
    
}
