package ques_1_and_2;

public class Current implements Account {
   public void deposit(double amount){
       System.out.println("Amount " + amount + " deposited in current account");
   } 
   
   public void withdraw(double amount){
       System.out.println("Amount " + amount + " withdrawn from current account");
   }  
}
