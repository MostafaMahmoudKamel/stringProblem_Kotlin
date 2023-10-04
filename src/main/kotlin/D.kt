fun main(){
    var s1=readLine()!!
    var s2=readLine()!!
    println("${s1.length} ${s2.length}")
    println("$s1$s2")
    //convert string to char array to update on string chars
    var s1Chars=s1.toCharArray()
    var s2Chars=s2.toCharArray()
    //swapping 2 first chars in two string
    var temp=s1Chars[0]
     s1Chars[0]=s2Chars[0]
    s2Chars[0]=temp
    s1Chars.forEach{print(it)}
    print(" ")
    s2Chars.forEach{print(it)}


}