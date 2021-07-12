package condicionales

fun main(){
    println("Introdusca un numero")
    var x1 = readLine()!!.toInt()
    println("Introdusca un segundo numero")
    var x2 = readLine()!!.toInt()

    if(x1 / x2  == 0){
       println("error")
    }
}