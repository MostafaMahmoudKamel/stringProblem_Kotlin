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
    var words=s.split("username=","&pwd=","&profile=","&role=","&key=")
    println("username: ${words[1]}")
    println("pwd: ${words[2]}")
    println("profile: ${words[3]}")
    println("role: ${words[4]}")
    println("key: ${words[5]}")
}