package edu.psu

import org.junit.Test

class GroovyAccountTest {
    @Test
    void getBalance() {
        GroovyAccount account = new GroovyAccount()
        BigDecimal balance = account.balance
        assert balance == BigDecimal.ZERO
    }

    @Test
    void withdraw() {
        GroovyAccount account = new GroovyAccount(balance: 100.0)
        BigDecimal amount = 5.0
        BigDecimal existing = account.balance

        assert (95.0 - account.withdraw(amount)).abs() < 0.01
        assert (95.0 - account.balance).abs() < 0.01
    }

    @Test
    void deposit() {
        GroovyAccount account = new GroovyAccount(balance: 100.0)
        BigDecimal amount = 5.0
        BigDecimal existing = account.balance

        assert (105.0 - account.deposit(amount)).abs() < 0.01
        assert (105.0 - account.balance).abs() < 0.01

    }

    @Test(expected = IllegalArgumentException)
    void overdrawn() {
        GroovyAccount account = new GroovyAccount(balance: 100)
        account.withdraw(105)
    }

    @Test
    void testToString() {
        GroovyAccount account = new GroovyAccount(balance: 100)
        println account
    }
}
