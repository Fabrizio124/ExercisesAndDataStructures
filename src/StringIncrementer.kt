fun incrementString(str: String): String {
      var numero = ""
      var letra = ""

    if(str.isEmpty()   ){
       return "1"
    }

    if (str[str.length-1].isDigit() == false)  {
         return (str+"1")
         }

    for(i in 0..str.length-1) {
        if (str[i].isDigit()) {
            numero = numero + str[i]

        } else {
            letra = letra + str[i]

        }
    }
    var resultado = numero.toInt()+1
    var ceros = (numero.length - resultado.toString().length)
    println()
    var result = ""
    if(ceros > 0){
        result = letra + "0".repeat(ceros) + resultado.toString()

    } else {
        result= letra + resultado.toString()
    }

    return result
}

fun main(){
   println(incrementString("009"))
}

