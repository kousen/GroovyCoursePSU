package edu.psu

import com.google.gson.Gson
import groovy.json.JsonSlurper
import groovy.transform.Canonical

String url = 'http://api.open-notify.org/iss-now.json'
//String jsonTxt = url.toURL().text
def json = new JsonSlurper().parse(url.toURL())
def position = json.iss_position
println "(${position.latitude},${position.longitude})"

String astroUrl = 'http://api.open-notify.org/astros.json'
json = new JsonSlurper().parse(astroUrl.toURL())
println "There are ${json.number} people in space"
for (person in json.people) {
    println("${person.name} aboard ${person.craft}")
}

@Canonical
class Assignment {
    String name
    String craft
}

@Canonical
class AstroResult {
    String message
    int number
    List<Assignment> people
}

AstroResult result = new Gson().fromJson(
        astroUrl.toURL().text, AstroResult)

println "There are ${result.number} people in space"
for (p in result.people) {
    println p.name
}

