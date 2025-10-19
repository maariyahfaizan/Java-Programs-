package ques1;

public class Person {
    String name;
    int phone;
    
    class Address{
        String houseNo;
        String street;
        String city;
        String state;

        public Address(String houseNo, String street, String city, String state) {
            this.houseNo = houseNo;
            this.street = street;
            this.city = city;
            this.state = state;
        }
        
        void displayAddr() {
            System.out.println("Address:");
            System.out.println("House No: " + houseNo);
            System.out.println("Street: " + street);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
        
    }
    
    class DateOfBirth {
        int day;
        int month;
        int year;

        public DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        
        void displayDOB(){
            System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
        }
    }

    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
    
     void display(Address add, DateOfBirth dob){
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            add.displayAddr();
            dob.displayDOB();
        }
}
