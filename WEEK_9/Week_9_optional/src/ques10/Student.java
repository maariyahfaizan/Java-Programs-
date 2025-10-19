package ques10;

public class Student {
    String rollNo;
    String name;
    int marks;
    static String schoolName;

    public Student(String rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    static void changeSchoolName(String newName){
        schoolName=newName;
    }
    
    void print(){
        System.out.println("RollNo = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
        System.out.println("School Name = " + schoolName);
    }
}
