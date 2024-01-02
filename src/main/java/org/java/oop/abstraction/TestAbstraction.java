package org.java.oop.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 12000, 6.78);
        System.out.println("*** Savings Account ***");
        System.out.println("Before performing any operation: " +savingsAccount);
        savingsAccount.performAccountOperation(13000);
        System.out.println("After performing some operation: " +savingsAccount);

        System.out.println("\n*** Current Account ***");
        CurrentAccount currentAccount = new CurrentAccount("Jane Doe", 150000, 1234);
        System.out.println("Before Performing any operation: " + currentAccount);
        currentAccount.performAccountOperation(123);
        System.out.println("After Performing some operation: " + currentAccount);
    }
}
