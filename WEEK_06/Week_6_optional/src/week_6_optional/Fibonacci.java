package week_6_optional;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int n=sc.nextInt();
        int second=1;
        int first=0;
        System.out.println("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(first + " ");
            int next= second + first;
            first = second;
            second = next;
        }
    }
    
}
