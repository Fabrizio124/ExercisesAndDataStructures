fun minimo(args: ArrayList<Int>) : Int{
    var min = args[0]
    for (i in 0 until args.size) {

        if (min > args[i]) {
            min = args[i]
        }
    }
    return min
}
fun main() {
    println(maximo(arrayListOf(4,6,1,2,3,4,5,6)))
}