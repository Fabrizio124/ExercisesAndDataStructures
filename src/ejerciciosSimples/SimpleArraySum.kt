package ejerciciosSimples



fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var a = 0

    for (index in 0..ar.size -1 ){
       // println(ar[index])
         a = a + ar[index]
         // a : 1

      //  println(a)
      //  println("---------------------")
    }
    return  a
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

     println(result)
}