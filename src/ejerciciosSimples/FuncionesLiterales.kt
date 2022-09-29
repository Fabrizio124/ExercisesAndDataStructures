package ejerciciosSimples

/* Function literals are unnamed functions that can be treated as expressions:
 we can assign them to variables, call them, pass them as arguments,
 and return them from a function as we could with any other value.

Two types of function literals are anonymous functions and lambda expressions.*/

fun main() {
    // Anonymous Function:
    var getProduct = fun(num1: Int, num2: Int): Int {
        return num1 * num2
    }
    println(getProduct(8, 3)) // Prints: 24

    // Lambda Expression
    var getDifference = { num1: Int, num2: Int -> num1 - num2 }
    println(getDifference(10, 3)) // Prints: 7
}