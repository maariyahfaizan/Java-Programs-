package ques8;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter side of square: ");
        System.out.println("Area = " + Shape.area(sc.nextInt()));
        System.out.println("Enter length and breadth of rectangle: ");
        System.out.println("Area = " + Shape.area(sc.nextInt(), sc.nextInt()));
        System.out.println("Enter radius of circle: ");
        System.out.println("Area = " + Shape.area(sc.nextDouble()));
    }
    
}
