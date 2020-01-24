package edu.psu.exercises

String string = '''\
This is a
multi-line string
with several words
on each line
'''

println string.toLowerCase().readLines().collect { line ->
    line.findAll(/[aeiouy]/).size()
}

println string.toLowerCase()
        .readLines()*.findAll(/[aeiou]/)*.size()
