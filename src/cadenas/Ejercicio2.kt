package cadenas
fun main() {

    println("¿Cual es tu nombre?")
    var nombre = readLine()!!.toString()
    var nameFinal = ""

    println(nombre.uppercase())
    println(nombre.lowercase())

    var  s=  nombre.split(" ")

    for(i in 0..s.size-1){

        for(j in 0..s[i].length-1){
             if(j == 0  ){
                 nameFinal = nameFinal + s[i][j].uppercase()

             } else {
               nameFinal = nameFinal + s[i][j].lowercase()

             }
        }

        nameFinal = nameFinal + " "
    }

    println(nameFinal)
}
