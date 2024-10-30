package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testInitialBalanceCannotBeLessThanMinimumBalance() {
        try {
            new BankAccount(50, 100, "Test User");
            fail("Expected IllegalArgumentException for balance below minimum balance");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void testAccountHolderName() {
        BankAccount account = new BankAccount(100, 50, "John Doe");
        assertEquals("John Doe", account.getAccountHolderName());
    }

    @Test
    void testGetBalance() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        assertEquals(100, account.getBalance());
    }

    @Test
    void testGetMinimumBalance() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        assertEquals(50, account.getMinimumBalance());
    }

    @Test
    void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    void testDepositNegativeAmountThrowsException() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        try {
            account.deposit(-50);
            fail("Expected IllegalArgumentException for negative deposit amount");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void testDepositZeroAmountThrowsException() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        try {
            account.deposit(0);
            fail("Expected IllegalArgumentException for zero deposit amount");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        account.withdraw(30);
        assertEquals(70, account.getBalance());
    }

    @Test
    void testWithdrawNegativeAmountThrowsException() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        try {
            account.withdraw(-30);
            fail("Expected IllegalArgumentException for negative withdraw amount");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void testWithdrawZeroAmountThrowsException() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        try {
            account.withdraw(0);
            fail("Expected IllegalArgumentException for zero withdraw amount");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }

    @Test
    void testWithdrawBeyondMinimumBalanceThrowsException() {
        BankAccount account = new BankAccount(100, 50, "Test User");
        try {
            account.withdraw(60);
            fail("Expected IllegalArgumentException for withdrawal beyond minimum balance");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
