package week_7;
import java.util.Scanner;

public class BinarySearch {

    public static int BinarySearch(int[] arr,int start,int end,int key){
        if (start>end)
            return -1;
        else{
            int middle = (start+end)/2;
            if (arr[middle]==key)
                return middle;
            if (arr[middle]>key)
                return BinarySearch(arr,start,middle-1,key);
            
             return BinarySearch(arr,middle+1,end,key);
        }
    }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements (must be sorted): ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int result=BinarySearch(arr,0,n-1,key);
        if (result==-1){
            System.out.println(key+" is not in array");
        }
        else{
            System.out.println(key + " is at index " + result);
        }
    }
    
}
