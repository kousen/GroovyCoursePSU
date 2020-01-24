package edu.psu.exercises

import java.util.stream.Collectors

List<String> strings = 'this is a list of strings'.split()

println strings
println strings.sort(false)
println strings

// Java comparator using anonymous inner class
strings.sort(false, new Comparator<String>() {
    @Override
    int compare(String s1, String s2) {
        return s1.length() <=> s2.length()
    }
})

// Groovy sort with 2-param closure
println strings.sort(false) { s1, s2 -> s1.size() <=> s2.size() }

// Groovy sort with 1-param closure
println strings.sort { -it.size() }

// Java with streams
println strings.stream()
    .sorted(Comparator.comparing({ String s -> s.size() }))
    .collect(Collectors.toList())


