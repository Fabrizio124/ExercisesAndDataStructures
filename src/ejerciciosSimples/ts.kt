package ejerciciosSimples

fun twoString1s(s1: String, s2: String) {
    var yes = "YES"
    var no = "NO"

    for (index in 0..s1.length -1  ){
        if(s1[index] != s2[index]){
            println(no)

        }
        else  {
            println(yes)
            break
        }

    }
}

fun main(){
    twoString1s("hello", "world")
    println("------------")
    twoString1s("hiii", "world")

}