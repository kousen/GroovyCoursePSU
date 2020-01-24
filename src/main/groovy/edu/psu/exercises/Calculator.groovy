package edu.psu.exercises

class Calculator {
    static int sumNumbers(List<Integer> numbers) {
        if (!numbers) return 0
        numbers.sum() as int
    }

    static int sumNumbers_usingLoop(List<Integer> numbers) {
        if (!numbers) return 0
        int total = 0
        for (n in numbers) {
            total += n
            // total = total + n
        }
        return total
    }

    static int sumDoubles_usingSpreadDot(List<Integer> numbers) {
        if (!numbers) return 0
        return numbers*.multiply(2).sum() as int
    }

    static int sumDoubles_usingCollect(List<Integer> numbers) {
        if (!numbers) return 0
        return numbers.collect { it * 2 }.sum() as int
    }

    static int sumDoubles_usingSumWithClosure(List<Integer> numbers) {
        if (!numbers) return 0
        return numbers.sum { it * 2 } as int
    }

    static int sumDoubles_usingSumAndDouble(List<Integer> numbers) {
        if (!numbers) return 0
        return numbers.sum() * 2 as int
    }

    static int sumDoubles_usingDoubleAndSum(List<Integer> numbers) {
        if (!numbers) return 0
        return (numbers * 2).sum() as int
    }

    static int sumDoubles_usingIntStream(List<Integer> numbers) {
        if (!numbers) return 0
        return numbers.stream()
                .mapToInt { it * 2 }
                .sum()
    }

    // Average in Groovy
    static BigDecimal average(List<Integer> numbers) {
        if (!numbers) return 0

        return numbers.sum() / numbers.size()
    }

    // Average using Java Streams
    static double average_usingDoubleStream(List<Integer> numbers) {
        numbers.stream()
            .mapToDouble { it.doubleValue() }
            .average().orElse(0.0)
    }
}
