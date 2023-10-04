fun main(){
    var num=readLine()!!.toInt()//Num of test cases
    repeat(num){
        var s=readLine()!!//string input
        var charArr=s.toCharArray()
        if(s.length<=10)
            println(s)
        else{
            println("${charArr[0]}${s.length-2}${charArr[s.length-1]}")
        }
    }
}