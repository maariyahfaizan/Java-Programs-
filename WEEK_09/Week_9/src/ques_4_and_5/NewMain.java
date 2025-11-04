package ques_4_and_5;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Savings account: ");
        System.out.println("Enter account ID: ");
        int id1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account holder: ");
        String ah1=sc.nextLine();
        System.out.println("Enter address: ");
        String a1= sc.nextLine();
        System.out.println("Enter current balance: ");
        double b1=sc.nextDouble();
        System.out.println("Enter min balance: ");
        double mb=sc.nextDouble();
        Savings s = new Savings(id1,ah1,a1,mb,b1);
        s.display();
        System.out.println("Enter amount to be deposited: ");
        s.deposit(sc.nextDouble());
        System.out.println("Enter amount to be withdrawn: ");
        s.withdraw(sc.nextDouble());
        
        System.out.println("");
        System.out.println("For Current account: ");
        System.out.println("Enter account ID: ");
        int id2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account holder: ");
        String ah2=sc.nextLine();
        System.out.println("Enter address: ");
        String a2= sc.nextLine();
        System.out.println("Enter current balance: ");
        double b2=sc.nextDouble();
        System.out.println("Enter min balance: ");
        double mw=sc.nextDouble();
        Current c = new Current(id2,ah2,a2,mw,b2);
        c.display();
        System.out.println("Enter amount to be deposited: ");
        c.deposit(sc.nextDouble());
        System.out.println("Enter amount to be withdrawn: ");
        c.withdraw(sc.nextDouble());
        
    }
    
}
