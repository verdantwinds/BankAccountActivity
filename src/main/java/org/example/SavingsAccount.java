package org.example;

public class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(double balance, double minimumBalance, String accountHolderName, double interestRate) {
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        balance += balance * interestRate;
    }
}
