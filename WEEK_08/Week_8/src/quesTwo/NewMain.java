package quesTwo;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        //using three argument constructor
        System.out.println("For apple: ");
        System.out.println("Enter color: ");
        String c1=sc.next();
        System.out.println("Enter price: ");
        int p1=sc.nextInt();
        System.out.println("Enter taste: ");
        String t1=sc.next();
        FRUIT apple=new FRUIT(c1,t1,p1);
        apple.display();
        
        //using two argument constructor
        System.out.println("");
        System.out.println("For mango: ");
        System.out.println("Enter taste: ");
        String t2=sc.next();
        System.out.println("Enter price: ");
        int p2=sc.nextInt();
        FRUIT mango=new FRUIT(t2,p2);
        System.out.println("Enter color: ");
        String c2=sc.next();
        mango.setDetails(c2,t2,p2);
        mango.display();
        
        //using one argument constructor
        System.out.println("");
        System.out.println("For peach: ");
        System.out.println("Enter color: ");
        String c3=sc.next();
        FRUIT peach=new FRUIT(c3);
        peach.display(); 

        //using constructor-chaining
        System.out.println("");
        System.out.println("For orange: ");
        FRUIT orange= new FRUIT(100);
        orange.display();
        
    }
    
}
