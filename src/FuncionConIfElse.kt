fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    if (N % 2 == 1){ //impar
        println("Weird")

    } else if( N in 2..5 ) {
        println("Not Weird")

    } else if(N in 6..20) {
        println("Weird")

    } else {(N > 20)
        println("Not Weird")

    }
}






