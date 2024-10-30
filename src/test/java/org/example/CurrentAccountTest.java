package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    @Test
    void testMaxWithdrawalAmountProperty() {
        CurrentAccount account = new CurrentAccount(500, 100, "Test User", 200);
        assertEquals(200, account.getMaxWithdrawalAmount());
    }

    @Test
    void testWithdrawWithinMaxLimit() {
        CurrentAccount account = new CurrentAccount(500, 100, "Test User", 200);
        account.withdraw(150);
        assertEquals(350, account.getBalance());
    }

    @Test
    void testWithdrawBeyondMaxLimitThrowsException() {
        CurrentAccount account = new CurrentAccount(500, 100, "Test User", 200);
        try {
            account.withdraw(250);
            fail("Expected IllegalArgumentException for exceeding max withdrawal limit");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
