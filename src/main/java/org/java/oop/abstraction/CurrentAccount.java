package org.java.oop.abstraction;

public class CurrentAccount extends BankAccount{
    private final double overdraftLimit;

    CurrentAccount(String accountHolderName, double balance, double overdraftLimit) {
        super(accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void performAccountOperation(double amount) {
        if (accountBalance + overdraftLimit >= amount) {
            accountBalance -= amount;
            System.out.println("Transaction successful for Current Account.");
        } else {
            System.out.println("Insufficient funds for Current Account.");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
}
