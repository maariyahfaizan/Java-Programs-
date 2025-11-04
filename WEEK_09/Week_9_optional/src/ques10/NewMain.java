package ques10;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("First student: ");
        System.out.println("Enter roll no., name and marks: ");
        Student s1 = new Student(sc.nextLine(),sc.nextLine(),sc.nextInt());
        sc.nextLine();
        Student.schoolName="ABC";
        s1.print();
        
        System.out.println("");
        System.out.println("Second Student (changing static field): ");
        System.out.println("Enter roll no., name and marks");
        Student s2 = new Student(sc.nextLine(),sc.nextLine(),sc.nextInt());
        sc.nextLine();
        System.out.println("Enter new name: ");
        Student.changeSchoolName(sc.nextLine());
        System.out.println("Student 2: ");
        s2.print();
        System.out.println("");
        System.out.println("Student 1: ");
        s1.print();
    }
    
}
