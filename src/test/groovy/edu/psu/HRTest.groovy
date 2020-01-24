package edu.psu

import org.junit.Test

class HRTest {

    @Test
    void payEverybody() {
        List emps = [new Hourly(name: 'Fred', rate: 30),
            new Salaried(name: 'Wilma')]

        HR hr = new HR()
        hr.payEverybody(emps)

        println emps.sort()
    }
}
