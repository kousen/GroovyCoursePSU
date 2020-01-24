String s = 'This is a sentence'
assert s.length() == s.size()

println s[0..3,5..6,8,10..-1]
println s[-3..-1]
println s[-1..-3]
assert s[-1..0] == s.reverse()

println s + ' with more words'
assert s == 'This is a sentence'

println s - 'is' - 'is'

String name = 'Dolly'
println "Hello, $name!"
println 'Hello, $name!'

Date now = new Date()
Date then = now + 3
println "$now, $then"

println now
println now++
println(++now)

