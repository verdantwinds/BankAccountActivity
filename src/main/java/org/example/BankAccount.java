package org.example;

public class BankAccount {
    protected double balance;
    protected final double minimumBalance;
    protected String accountHolderName;

    public BankAccount(double balance, double minimumBalance, String accountHolderName) {
        if (balance < minimumBalance) throw new IllegalArgumentException("Balance cannot be less than minimum balance.");
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal amount must be positive.");
        if (balance - amount < minimumBalance) throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
        balance -= amount;
    }
}
