
package week_4;

import java.util.Scanner;


public class Divide_by_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        while(n>=10){
           System.out.println(n);
            n=n/2;
        }
    }
}
