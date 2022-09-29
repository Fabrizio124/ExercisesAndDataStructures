package ejerciciosSimples

fun birthdayCakeCandles(candles: Array<Int>): Int{

    var counter = 0
    var max = 0
    for (element in candles){
        if (element > max){
            max = element
        }
    }
    for (element in candles){
        if (max == element){
            counter = counter + 1
        }
    }
    return counter
}

fun main(){
    println(birthdayCakeCandles(arrayOf<Int>(4,4,1,3)))
}