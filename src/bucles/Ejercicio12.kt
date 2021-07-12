package bucles

fun main(){
    println("Escriba una frase")
    var frase = readLine()!!.toString()
    println("Escriba una letra")
    var letra = readLine()!!.toString()

    var nuevo = 0

    for (i in 0..frase.length-1){
        if (frase[i].toString() == letra){

         nuevo = nuevo + 1
        }
    }
    println("La letra $letra aparece $nuevo veces en la frase '$frase'")
}