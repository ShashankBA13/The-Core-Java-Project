package org.java.oop.abstraction;

abstract class BankAccount {

    protected String accountHolderName;
    protected Double accountBalance;

    // Constructor
    BankAccount(String accountHolderName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    abstract void performAccountOperation(double amount);
}
