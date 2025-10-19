package ques3;

public class Account {
    int Id;
    String AccHolder;
    String address;
    double balance;
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    
    static double calSimpleInterest(double principal,double rate,double time){
        return (principal*rate*time)/100;
    }
    
    static double calCompoundInterest(double principal,double rate,double time){
        return principal * (Math.pow((1 + rate / 100), time)) - principal;
    }
    
    void details(){
        System.out.println("Id = " + Id);
        System.out.println("Account holder = " + AccHolder);
        System.out.println("Address = " + address);
    }
}
