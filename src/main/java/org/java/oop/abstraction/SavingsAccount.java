package org.java.oop.abstraction;

public class SavingsAccount extends BankAccount{
    private final double interestRate;

    // Constructor
    SavingsAccount(String accountHolderName, double accountBalance, double interestRate) {
        super(accountHolderName, accountBalance);
        this.interestRate = interestRate;
    }

    @Override
    void performAccountOperation(double amount) {
        // Additional logic for a savings account, e.g., apply interest
        accountBalance += amount + (amount * interestRate / 100);
        System.out.println("Transaction successful for Savings Account.");
        System.out.println("Current Balance: ₹" + accountBalance);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
