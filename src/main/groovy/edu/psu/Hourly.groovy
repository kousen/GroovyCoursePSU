package edu.psu

class Hourly extends Employee {
    BigDecimal rate = 125.0
    double hours = 40.0

    @Override
    BigDecimal computePay() {
        return rate * hours
    }
}
