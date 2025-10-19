package ques7;

public class Employee {
        String empName;
        int empId;
        Salary s;
        JoiningDate j;
        
       class Salary {
            double basic;
            double hra;
            double pf;
            
              
            Salary(double basic,double hra,double pf){
                this.basic=basic;
                this.hra=hra;
                this.pf=pf;
            }
            
            void displaySalary(){
                double salary=basic+hra+pf;
                System.out.println("Salary: " + salary);
            } 
        }
       
       class JoiningDate {
           int date;
           int month;
           int year;

        public JoiningDate(int date, int month, int year) {
            this.date = date;
            this.month = month;
            this.year = year;
        }
           
           void displayJoiningDate(){
            System.out.println("Date of Joining: " + date + "/" + month + "/" + year);
       }
    }

    public Employee(String empName, int empId,double basic,double hra,double pf,int date,int month,int year) {
        this.empName = empName;
        this.empId = empId;
        this.s= new Salary(basic,hra,pf);
        this.j = new JoiningDate(date,month,year);
    }
       
    void displayEmployee(){
        System.out.println("Name: " + empName);
        System.out.println("Employee Id: " + empId);
        s.displaySalary();
        j.displayJoiningDate();
    }
       
       
    }
