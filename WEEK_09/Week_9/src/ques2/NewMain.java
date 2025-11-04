package ques2;
import java.util.Scanner;
public class NewMain {

    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);
       Department cs=new Department();
       System.out.println("Enter name of department: ");
       cs.setName(sc.nextLine());
       System.out.println("Enter name of Chairperson: ");
       cs.setChairperson(sc.nextLine());
       System.out.println("Enter name of Faculty: ");
       cs.setFacultyName(sc.nextLine());
       System.out.println("Enter name of University: ");
       cs.setUniversityName(sc.nextLine());
       System.out.println("Enter ranking of university: ");
       cs.setRanking(sc.nextInt());
       System.out.println("");
       cs.display();
    }
    
}
