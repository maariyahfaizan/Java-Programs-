package ques1;

public class NewMain {

    public static void main(String[] args) {
        Person p=new Person("Maria",167383628);
        Person.Address add=p.new Address("7272","XYZ","Aligarh","UP");
        Person.DateOfBirth dob = p.new DateOfBirth(10, 5, 2004);
        p.display(add,dob);
    }
    
}
