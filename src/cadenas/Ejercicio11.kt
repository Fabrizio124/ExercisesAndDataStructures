package cadenas

fun main (){
    println("Introduce el nombre el un producto")
       var producto = readLine()!!.toString()

    println("Introuce su precio")
     var precio = readLine()!!.toFloat()

    println("Introduce sus unidades")
    var unidades = readLine()!!.toInt()

    var total = precio * unidades
    println("$producto: $unidades unidades * $precio$ = $total$ ")

}