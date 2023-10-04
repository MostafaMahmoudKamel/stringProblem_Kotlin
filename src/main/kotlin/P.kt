//fun main(){
//    //0==0 so it will print desha only
//    for(i in 0..0)
//        print("desha")
//    //digit to int conver '0'-->0 not 'a'-->97
//    var char ='0'
//    print(char.code)
//    var s="zkmda"
//    var newString=s.dropLast(3)//take number of delete char
//
//    print(newString)
//    println()
//    var charArr=s.toCharArray()
//    charArr.sort(0,3)
//    charArr.forEach{print(it)}
//    println()
//    println(s.substring(0,2))
//
//}

fun main(){
    var s=readLine()!!
    //split . ? space , !
    var words=s.split(" ",".","!","?",",")
    var count=0
    for(word in words){
        if(word.isNotEmpty())            //count nonEmpty list[string]
            count++
    }
    println(count)
}