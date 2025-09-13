package week_7_optional;
import java.util.Scanner;


public class quickSort {
    public static void quicksort(int[] arr,int low,int high){
        
       if (low<high){
        int j= partition(arr,low,high);
        
        quicksort(arr,low,j-1);
        quicksort(arr,j+1,high); 
        }
    }
    
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<j){
            while(i <= j && arr[i]<pivot)i++;
            while(i <= j && arr[j]>pivot)j--;
            if(i>=j)break;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }
    
    public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
