
package week_1;
import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        double n=sc.nextDouble();
        double cube= Math.pow(n, 3);
        System.out.println("Cube of " + n + " is " + cube);
        
    }
    
}
