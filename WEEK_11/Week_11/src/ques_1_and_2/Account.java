package ques_1_and_2;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    
    static void aboutBank() {
        System.out.println("Welcome to ABC Bank!");       
    }
    
    default void takeLoan(double amount) {
        System.out.println("Loan facility is not available for this account type.");
    }
}
