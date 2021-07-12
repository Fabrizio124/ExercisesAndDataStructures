package bucles

fun main(){
    var primerAsterisco = "*"
    var segundoAsterisco = ""
    var numero = readLine()!!.toInt()

        for(i in 1..numero) {
        segundoAsterisco = segundoAsterisco + primerAsterisco
        println(segundoAsterisco)
    }
}