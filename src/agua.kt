fun AguaCalculo(consumo: Int, dias: Int, years: Int): Int {
    return consumo * dias * years

}

fun main(){
    println("${AguaCalculo(5, 365, 15)}")
    println("${AguaCalculo(2, 365, 15)}")

}
