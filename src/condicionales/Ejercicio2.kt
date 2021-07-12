package condicionales

fun main() {
    var c = "contraseña"

    println("Introdusca su contraseña")
    var contra = readLine()!!.toString()

    if(contra == c.lowercase() || contra == c.uppercase() ){
        println("Su contraseña es correcta")
    }  else {
        println("Su contraseña es incorrecta")
    }
}