package ques_4_and_5;

public class Savings extends Account{
    double min_balance;
    double balance;
    
    public Savings (int Id, String AccHolder, String address,double min_balance,double balance){
        super(Id,AccHolder,address);
        this.min_balance=min_balance;
        this.balance=balance;
    }
    
    void display(){
        super.display();
        System.out.println("Min_balance = " + min_balance);
        System.out.println("Balance = " + balance);
    }
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance in savings account: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    void withdraw(double amount){
        if(amount > 0 && balance-amount<min_balance){
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }
}
