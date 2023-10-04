fun main(){
    var size=readLine()!!.toInt()
    var s=readLine()!!
    var charArr=s.toCharArray()
    for(i in 0 until charArr.size-1){
        for(j in i+1 until charArr.size){
            if(charArr[i]>=charArr[j]){
                var temp=charArr[i]
                charArr[i]=charArr[j]
                charArr[j]=temp
            }
        }

    }
    println(String(charArr))
}