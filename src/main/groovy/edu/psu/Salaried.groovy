package edu.psu

class Salaried extends Employee {
    BigDecimal salary = 120000

    @Override
    BigDecimal computePay() {
        return salary / 52
    }
}
