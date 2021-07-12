package listasYduplas

fun main(){
    println("Bienvenido la calificacion para pasar una materia es de 7 para arriba")
    var lista = listOf("Matemáticas","Física","Química","Historia","Lengua")
    var valor = ""

    for(i in lista){
        println("Cuanto sacaste en $i :")
        var nota = readLine()!!.toInt()
        println("En $i sacaste $nota")
        println("\n")
       if (nota < 7){
           valor = valor + i
           valor = valor + " "
       }

    }
    println("Sus materias a volver cursar son: $valor ")
}