package edu.psu;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    @Test
    public void getBalance() {
        Account account = new Account();
        BigDecimal balance = account.getBalance();
        assertEquals(BigDecimal.ZERO, balance);
    }

    @Test
    public void withdraw() {
        Account account = new Account(new BigDecimal("100"));
        BigDecimal amount = new BigDecimal("5.0");
        BigDecimal existing = account.getBalance();

        assertEquals(existing.subtract(amount), account.withdraw(amount));
        assertEquals(existing.subtract(amount), account.getBalance());
    }

    @Test
    public void deposit() {
        Account account = new Account();
        BigDecimal dep = new BigDecimal("5.0");
        BigDecimal existing = account.getBalance();
        assertEquals(existing.add(dep), account.deposit(dep));
        assertEquals(existing.add(dep), account.getBalance());
    }
}