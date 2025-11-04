package ques3;

public class NewMain {
    public static void main(String[] args) {
        // Create an Account object
        Account acc1 = new Account();

        // Initialize fields
        acc1.Id = 101;
        acc1.AccHolder = "Alice Johnson";
        acc1.address = "123 Park Street";
        acc1.balance = 5000.0;

        // Display account details
        acc1.details();

        // Perform deposit
        acc1.deposit(1500);

        // Perform withdrawal
        acc1.withdraw(2000);

        // Calculate simple interest
        double si = Account.calSimpleInterest(10000, 5, 2); // P=10000, R=5%, T=2 years
        System.out.println("Simple Interest = " + si);

        // Calculate compound interest
        double ci = Account.calCompoundInterest(10000, 5, 2); // P=10000, R=5%, T=2 years
        System.out.println("Compound Interest = " + ci);
    }
}