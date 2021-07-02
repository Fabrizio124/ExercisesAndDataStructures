package cadenas

fun main(){
    println("¿Cual es tu correo electronico?")
    var correo = readLine()!!.toString()
    var s = correo.split("@")

    var dominio = "@ceu.es"

    println(s[0] + dominio)


}