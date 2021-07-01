fun main() {

    fun reverseLetter(str: String): String {
        var resultado = ""

        var i = str.length-1
        while (i >= 0) {

            if(str[i].isLetter()){
               resultado = resultado+(str[i])
            }
            i--
        }
     return resultado
    }


    println(reverseLetter("H3acker"))
    println("----------")
    println(reverseLetter("Ra2nk"))
}
