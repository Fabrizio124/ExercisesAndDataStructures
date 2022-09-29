package ejerciciosSimples

fun startRatin(str: String): String{

    var oupout = ""

    var numero = str[0].digitToInt()
    var decimal = str[2].digitToInt()

    for (index in 1..5){
      if (index <= numero  ) {
          oupout = oupout + "full"
          oupout += " "

      } else if (decimal != 0 && index  == numero +1) {
          oupout  = oupout + "half"
          oupout += " "
      } else {
          oupout = oupout + "empty"
          oupout += " "
      }
    }
    return oupout
}

fun main(){
    println(startRatin("5.00"))
}