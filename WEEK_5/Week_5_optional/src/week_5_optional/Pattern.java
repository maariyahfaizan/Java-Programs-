package week_5_optional;
import java.util.Scanner;


public class Pattern {

   
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }  
        for(int i=1;i<=n;i++){
            for(int j=n;j>n-i;j--){
                System.out.print(" ");
            }
            for(int k=n;k>i;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
