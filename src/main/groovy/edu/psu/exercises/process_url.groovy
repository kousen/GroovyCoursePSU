package edu.psu.exercises

String home = 'https://psu.edu'

// Process lines from the URL
home.toURL().eachLine {
    println it.size()
}

// Process lines from the downloaded string
home.toURL().text.eachLine {
    println it.size()
}

// Get the lines into a list
println home.toURL().readLines().collect { it.size() }
println home.toURL().readLines()*.size()

// There is also a readLines() method on String
