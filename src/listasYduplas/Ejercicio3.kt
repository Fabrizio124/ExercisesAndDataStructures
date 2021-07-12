package listasYduplas

fun main(){
    var lista = listOf("Matemáticas","Física","Química","Historia","Lengua")
    var valor = 0

    for(i in lista){
        println("Cuanto sacaste en $i :")
      var nota = readLine()!!.toInt()
      println("En $i sacaste $nota")
        println("\n")
        valor = valor + nota
    }
        valor /= 5
       println("Tu promedio final es $valor")
}