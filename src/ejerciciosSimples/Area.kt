package ejerciciosSimples

// Return type is declared outside the parentheses
fun getArea(length: Int, width: Int): Int {
    var area = length * width

    // return statement
    return area
}

fun main() {
    var myArea = getArea(10, 8)
    println("The area is $myArea.") // Prints: The area is 80.
}