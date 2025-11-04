package week_5;
import java.util.Scanner;

public class Sum_series {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=(1.0f/i);
        }
        System.out.println("Sum = " + sum);
    }
    
}
