package edu.psu.exercises

import org.junit.Test

class CalculatorTest {

    @Test
    public void sumNumbersWithNoList() {
        int sum = Calculator.sumNumbers()
        assert sum == 0
    }

    @Test
    public void sumNumbersWithList() {
        int sum = Calculator.sumNumbers([3, 1, 4, 1, 5, 9])
        assert sum == 23
    }

    @Test
    public void sumNumbersWithList_usingLoop() {
        int sum = Calculator.sumNumbers_usingLoop([3, 1, 4, 1, 5, 9])
        assert sum == 23
    }

    @Test
    public void sumDoubles_usingSpreadDot() {
        int sum = Calculator.sumDoubles_usingSpreadDot([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void sumDoubles_usingCollect() {
        int sum = Calculator.sumDoubles_usingCollect([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void sumDoubles_usingSumWithClosure() {
        int sum = Calculator.sumDoubles_usingSumWithClosure([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void sumDoubles_usingSumAndDouble() {
        int sum = Calculator.sumDoubles_usingSumAndDouble([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void sumDoubles_usingDoubleAndSum() {
        int sum = Calculator.sumDoubles_usingDoubleAndSum([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void sumDoubles_usingIntStream() {
        int sum = Calculator.sumDoubles_usingIntStream([3, 1, 4, 1, 5, 9])
        assert sum == 46
    }

    @Test
    public void average() {
        assert Calculator.average([3, 3, 3, 3, 3]) == 3.0
    }

    @Test
    public void average_withStreams() {
        assert Calculator.average_usingDoubleStream([3, 3, 3, 3, 3]) == 3.0
    }
}
