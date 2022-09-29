package ejerciciosSimples

fun FirstFactorial(num: Int): Int {
    var a = 1
    var b : Int
    var c : Int

    for (index in 1..num -1){
        a = a * index
        // a : 1
        b = index + 1
        // b : 2
        c = a * b
        // c : 2
        println(c)
    }
    return num;
}

fun main() {
    println(FirstFactorial(4))
}