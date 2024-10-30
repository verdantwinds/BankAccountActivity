package org.example;

public class CurrentAccount extends BankAccount {
    private final double maxWithdrawalAmount;

    public CurrentAccount(double balance, double minimumBalance, String accountHolderName, double maxWithdrawalAmount) {
        super(balance, minimumBalance, accountHolderName);
        this.maxWithdrawalAmount = maxWithdrawalAmount;
    }

    public double getMaxWithdrawalAmount() {
        return maxWithdrawalAmount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > maxWithdrawalAmount) throw new IllegalArgumentException("Withdrawal amount exceeds the maximum limit.");
        super.withdraw(amount);
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "balance=" + balance +
                ", minimumBalance=" + minimumBalance +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", maxWithdrawalAmount=" + maxWithdrawalAmount +
                '}';
    }
}
