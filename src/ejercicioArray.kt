import java.util.*
import kotlin.collections.ArrayList

fun main(args : Array<String>) {

    fun cadena(arrai: ArrayList<Int>): MutableList<Int> {
        var arraiResultante: MutableList<Int> = mutableListOf()
        for ( index in arrai) {
            arraiResultante.add(index*2)
        }
        return arraiResultante
    }

    var Result = cadena(arrayListOf(4, 6, 8))
    println(Result)

    var Resulta = cadena(arrayListOf(7,8,8,9,7))
    println(Resulta)
}









 
