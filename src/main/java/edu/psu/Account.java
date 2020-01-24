package edu.psu;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = BigDecimal.ZERO;

    public Account() { }

    public Account(BigDecimal initial) {
        balance = initial;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal deposit(BigDecimal amount) {
        balance = balance.add(amount);
        return balance;
    }

    public BigDecimal withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        return balance;
    }
}
