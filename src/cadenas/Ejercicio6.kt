package cadenas

fun main(){
    println("Cual es tu frase")
    var usuario = readLine().toString()

    println("Introduce una vocal")
    var vocal = readLine().toString()
    println(usuario  +  vocal.uppercase())

}