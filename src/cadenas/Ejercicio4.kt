package cadenas

fun main(){

    println("Escriba su prefijo-número-extension")
    var telefono = readLine()!!.toString()
    var telefonoFinal = ""

    for (i in 4..12){
       telefonoFinal = telefonoFinal + telefono[i]
    }

    println("su telefono es $telefonoFinal")
}