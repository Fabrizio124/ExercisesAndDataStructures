package ejerciciosSimples

fun marsExploration(s: String): Int {
    // Write your code here
    var counter = 0
    var index  = 2

    while (index < s.length) {

        if ('S' != s[index - 2]) {
            counter = counter + 1
        }

        if ('O' != s[index - 1]) {
            counter = counter + 1
        }

        if ('S' != s[index - 0]) {
            counter = counter + 1
        }
        index = index + 3
    }
    return counter
}

fun main(){
    println(marsExploration("SOSSPSSQSSOR"))
}
