package ques7;

public class Employee {
    String name;
    double Salary;

    public Employee(String name, double Salary) {
        this.name = name;
        this.Salary = Salary;
    }
    
    void details(){
        System.out.println("Name = " + name);
        System.out.println("Salary = " + Salary);
    }
}
