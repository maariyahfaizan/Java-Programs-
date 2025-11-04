package ques7;

public class Manager extends Employee {
    String department;

    public Manager(String department, String name, double Salary) {
        super(name, Salary);
        this.department = department;
    }
    
    void details(){
        super.details();
        System.out.println("Department = " + department);
    }
}
