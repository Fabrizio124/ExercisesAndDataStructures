fun calculo(parametro: String): Unit {
    var par = ""
    var impar = ""

    for (index in parametro.indices) {

        if (index % 2 == 1){
          impar = impar + (parametro[index]) //+=

        } else {
            par = par + (parametro[index])
        }
    }

    println("$par  $impar")
}
fun main(){
    calculo("Hacker")
    calculo("Rank")

}











