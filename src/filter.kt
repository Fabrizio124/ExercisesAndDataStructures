fun main() {

    val diasSemana:MutableList<String> = mutableListOf("Lunes","Martes", "Miercoles", "Jueves")
    println(diasSemana)

    val resultado = diasSemana.filter { it == "Lunes" }
    print(resultado)

}