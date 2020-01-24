package edu.psu

abstract class Employee implements Comparable<Employee> {
    String name

    abstract BigDecimal computePay()


    @Override
    String toString() { name }

    @Override
    int compareTo(Employee e) {
        e.computePay() - this.computePay()
    }
}
