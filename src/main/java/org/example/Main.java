package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccount generalAccount = new BankAccount(500, 100, "General User");
        CurrentAccount currentAccount = new CurrentAccount(1000, 200, "Current Account User", 300);
        SavingsAccount savingsAccount = new SavingsAccount(1500, 300, "Savings Account User", 0.03);

        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(generalAccount);
        accounts.add(currentAccount);
        accounts.add(savingsAccount);

        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
