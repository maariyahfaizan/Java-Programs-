package week_5_optional;

import java.util.Scanner;


public class Palindrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();
        int rev=0;
        int n=num;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        if(rev==num){
            System.out.println(num + " is a palindrome");
        }
        else
            System.out.println(num+ " is not palindrome");
    }
    
}
