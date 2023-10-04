import kotlin.math.*
fun main(){
    var t=readLine()!!.toInt()
    repeat(t){
        //list of two string s1,s2
        var listOf2String=readLine()!!.split(" ")
        var s1=listOf2String[0]// first string
        var s2=listOf2String[1]//second string
        var minLen=min(s1.length,s2.length)
        //print char of s1 followed by char by s2
        for(i in 0..minLen-1){
            print("${s1[i]}${s2[i]}")
        }
        //print char of s1 if it isn't empty
        if(s1.length>minLen){
            for(i in minLen..s1.length-1)
                print("${s1[i]}")
        }
        //print char of s2 if it isn't empty
        if(s2.length>minLen){
            for(i in minLen..s2.length-1)
                print("${s2[i]}")
        }
    println()
    }
}