package cadenas

fun main(){
     println("Introdusca su fecha de nacimiento en formato dd/mm/aaaa")
    var fecha = readLine()!!.toString()
    var s = fecha.split("/")
    println("Su dia es: ${s[0]}")
    println("Su mes es: ${s[1]}")
    println("Su año es: ${s[2]}")
}