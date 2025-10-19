package ques7;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter name of Employee: ");
        String name=sc.nextLine();
        System.out.println("Enter employee id: ");
        int id=sc.nextInt();
        System.out.println("Enter basic, hra and pf of employee: ");
        double basic=sc.nextDouble();
        double hra=sc.nextDouble();
        double pf=sc.nextDouble();
        System.out.println("Enter date month and year of joining: ");
        int date=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        Employee e = new Employee(name,id,basic,hra,pf,date,month,year);
        e.displayEmployee();
    }
    
}
