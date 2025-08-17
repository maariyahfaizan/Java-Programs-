package week_6;
import java.util.Scanner;
public class SwapArray {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("Array after swap is : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
