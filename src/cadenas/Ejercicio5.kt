package cadenas

fun main(){

    var frase = readLine().toString()
    println(frase.reversed())

    var nuevo = ""

    var i= frase.length-1
    while(i >= 0) {

        nuevo = nuevo + frase[i]
        i--
    }


    println(i)
}