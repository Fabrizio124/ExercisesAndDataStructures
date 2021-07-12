package condicionales

fun main(){
    var  grupo = "A"
    var group = "B"

    println("¿Como te llamas?")
   var name = readLine()!!.toString()

    println("¿Cual es tu sexo (M o H)?")
   var genero = readLine()!!.toString()


    if(genero >= "M" ){
        if (name.lowercase() < "m"){
            grupo = "A"
        }else{
            group = "B"
        }
    } else{
        if (name.lowercase() > "n"){
            grupo = "A"

        } else {
            group = "B"
            println("Tu grupo es $group")
        }

    }

}