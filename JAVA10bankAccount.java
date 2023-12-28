/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
 class bankAccount {
    private int accountId;
    private String accountName;
    private double balance;

    public bankAccount(int accountId, String accountName, double initialBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void transferTo(bankAccount destination, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            destination.deposit(amount);

            // Print receipt
            System.out.println("Transaction Details:");
            System.out.println("Account id: " + accountId);
            System.out.println("Name: " + accountName);
            System.out.println("Account Balance: Rs." + balance);
            System.out.println();
        } else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
    
}
\\OUTPUT
\\Transaction Details:
\\Account id: 12344
\\Name: Account A
\\Account Balance: Rs.3500.0

\\Account A Balance after the first transaction: Rs.3500.0

\\Transaction Details:
\\Account id: 56789
\\Name: Account B
\\Account Balance: Rs.1000.0

\\Account A Balance after the second transaction: Rs.6500.0
\\BUILD SUCCESSFUL (total time: 1 second)

