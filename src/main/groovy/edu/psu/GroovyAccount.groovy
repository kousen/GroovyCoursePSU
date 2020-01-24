package edu.psu

class GroovyAccount {
    BigDecimal balance = 0

    BigDecimal deposit(BigDecimal amount) {
        balance = balance + amount
        return balance
    }

    BigDecimal withdraw(BigDecimal amount) {
        if (balance >= amount) {
            balance = balance - amount
        } else {
            throw new IllegalArgumentException("You don't have enough funds for that")
        }
        return balance
    }

    @Override
    String toString() {
        return "GroovyAccount with balance $balance"
    }
}
