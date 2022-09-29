package ejerciciosSimples

/*
Function Description
Complete the camelcase function in the editor below.
camelcase has the following parameter(s):
string s: the string to analyze
Returns
int: the number of words in s
Input Format
A single line containing string s .*/

fun camelcase(s: String): Int {
    // Write your code here
    var b : Int
    var input = 0
    for(index in s ){
        if(index in 'A'..'Z'){
            input = input + 1
        }
    }
    b =  input +1
    println(b)

    return b
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = camelcase(s)

    println(result)
}