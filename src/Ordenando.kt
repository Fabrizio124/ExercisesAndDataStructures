fun meeting(s: String): String {
    val ordenar = s.split(";")

    var newAarray = mutableListOf<String>()
    for(i in 0..ordenar.size-1) {
        newAarray.add(ordenar[i].split(":").toString())
    }

    for(i in 0..newAarray.size-1) {
        for (j in 0..newAarray[i].length - 1) {
            println(newAarray[i][j])
        }
    }
    return "-ñ.ñ.ñ.ñ"
}
fun main(){
    println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"))
}
//cambiarlos a mapas
//agregar a un solo string