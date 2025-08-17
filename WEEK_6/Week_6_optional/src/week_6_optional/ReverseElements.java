package week_6_optional;
import java.util.Scanner;

public class ReverseElements {

  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("Array after reversal: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    
}
