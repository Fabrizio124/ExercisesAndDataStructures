package bucles

fun main(){
    println("Cuantos años tienes?")
    var edad = readLine()!!.toInt()

    println("Sus años son:")
        for (i in 1..edad){
            println(i)

    }
}