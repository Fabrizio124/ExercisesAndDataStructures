fun main(){
    println(mesDeTrismestre(5))

}

fun mesDeTrismestre(mes:Int):String{
    return when(mes){
        in 1..6 -> "Primer semestre"
        in 1..7 -> "Segundo semestre"
        else -> "No es un valor valido"
    }
}