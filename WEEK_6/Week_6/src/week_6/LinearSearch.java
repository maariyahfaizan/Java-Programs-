package week_6;

import java.util.Scanner;


public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched: ");
        int key=sc.nextInt();
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        if(index==-1)
            System.out.println("Element not in array");
        else
            System.out.println("Element found at " + index);
        
    }
    
}
