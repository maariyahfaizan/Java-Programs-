package ques_4_and_5;

public class Current extends Account{
    double max_withdrawl;
    double balance;
    
    public Current (int Id, String AccHolder, String address,double max_withdrawl,double balance){
        super(Id,AccHolder,address);
        this.max_withdrawl=max_withdrawl;
        this.balance=balance;
    }
    
    void display(){
        super.display();
        System.out.println("Max_withdrwal = " + max_withdrawl);
        System.out.println("Balance = " + balance);
    }
    
    void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance in current account: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    @Override
    void withdraw(double amount){
        if(amount > 0 && amount > balance && amount>max_withdrawl){
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }
}
