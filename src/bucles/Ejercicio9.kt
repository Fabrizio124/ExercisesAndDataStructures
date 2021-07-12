package bucles

fun main(){
    println("Cual es su contraseña?")
    var contraseña = "contraseña"
    var con = readLine()!!.toString()

        while (contraseña != con) {
            println("Introduce la contraseña")
            con = readLine()!!.toString()
        }
            println("Contraseña correcta")
}