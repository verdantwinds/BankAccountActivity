package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    @Test
    void testInterestRateProperty() {
        SavingsAccount account = new SavingsAccount(1000, 100, "Test User", 0.05);
        assertEquals(0.05, account.getInterestRate());
    }

    @Test
    void testApplyInterestIncreasesBalance() {
        SavingsAccount account = new SavingsAccount(1000, 100, "Test User", 0.05);
        account.applyInterest();
        assertEquals(1050, account.getBalance(), 0.01);
    }

    @Test
    void testApplyInterestMultipleTimes() {
        SavingsAccount account = new SavingsAccount(1000, 100, "Test User", 0.05);
        account.applyInterest();
        account.applyInterest();
        assertEquals(1102.5, account.getBalance(), 0.01);
    }
}
