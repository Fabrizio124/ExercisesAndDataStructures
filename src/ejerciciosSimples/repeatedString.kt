package ejerciciosSimples

fun repeatedString(s: String, n: Long): Any {
    // Write your code here
    if (s.length == 1){
        return n
    }
    var increaserStr = n - s.length

    var newStr = s
    var i = 0

    for (index in 1..increaserStr) {
        newStr = newStr + s[i]
        i = i + 1

        if (i == s.length) {
            i = 0
        }
    }

    var max = 0
    var a = 0
    for (ii in 0..s.length -1){
        for (j in 0..newStr.length-1){
             if(s[ii] == newStr[j] ){
                 a = a + 1
             }

           }
        if (a > max ){
            max = a
        }

        a = 0
    }

    return max
}

fun main() {
    println(repeatedString("a", 1000000000000))
}