package ques6;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle: ");
        Rectangle r = new Rectangle(sc.nextDouble(),sc.nextDouble());
        r.area();
        System.out.println("Enter radius of Circle: ");
        Circle c = new Circle (sc.nextDouble());
        c.area();
    }
    
}
