package edu.psu

import java.text.NumberFormat
import java.util.logging.Logger

class HR {
    Logger logger = Logger.getLogger("my logger")

    void payEverybody(List employees) {
        logger.info("whatever")
        def nf = NumberFormat.currencyInstance
        employees.each { Employee emp ->
            println(emp.name + " makes " + nf.format(emp.computePay()))
        }
    }
}
