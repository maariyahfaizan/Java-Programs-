package ques_4_and_5;

abstract class Account {
    int Id;
    String AccHolder;
    String address;

    public Account(int Id, String AccHolder, String address) {
        this.Id = Id;
        this.AccHolder = AccHolder;
        this.address = address;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    void display(){
        System.out.println("Id = " + Id);
        System.out.println("Account holder = " + AccHolder);
        System.out.println("Address = " + address);
    }
    
}
