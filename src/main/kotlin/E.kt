fun main(){
    var s=readLine()!!
    var charArr=s.toCharArray()
    var sum=0
    for(i in 0..charArr.size-1){
        sum+=charArr[i].digitToInt()//to convert char to Int
    }
    println(sum)
}