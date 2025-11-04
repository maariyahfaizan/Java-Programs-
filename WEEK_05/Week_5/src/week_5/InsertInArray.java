package week_5;

import java.util.Scanner;

public class InsertInArray {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements 10,20,30....");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
