
package week_4_optional;

import java.util.Scanner;


public class SumEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=2;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Sum = " + sum);
    }
    
}
