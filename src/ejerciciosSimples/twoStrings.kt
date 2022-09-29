package ejerciciosSimples



fun twoStrings(s1: String, s2: String):String  {
   var yes = "YES"
   var no = "NO"

    var stringPequeño = "a"
    var stringGrande = "b"

    if(s1.length > s2.length){
     stringGrande = s1
    stringPequeño = s2
    }else{
        stringGrande = s2
        stringPequeño = s1
    }

    for (index in 0..stringPequeño.length -1  ){
        if(stringPequeño[index] in stringGrande){
            return yes
        }
    }
    return no
}

fun main(){
    println(twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"))
    println("------------")
    println(twoStrings("hackerrankcommunity", "cdecdecdecde"))

}