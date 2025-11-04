package week_7_optional;
import java.util.Scanner;

public class GCD {

    public static int gcdIterative(int x, int y){
        int r=x%y;
        while(r>0){
            x=y;
            y=r;
            r=x%y;
        }
        return y;
    }
    
    public static int gcdRecursive(int x,int y){
        if (y==0)
            return x;
        return gcdRecursive(y,x%y);
    }
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("GCD By iterative method: ");
        System.out.println(gcdIterative(x,y));
        System.out.println("GCD by recursive method: ");
        System.out.println(gcdRecursive(x,y));
    }
}
