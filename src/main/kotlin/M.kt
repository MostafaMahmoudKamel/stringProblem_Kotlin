fun main(){
    var str=readLine()!!
    var j=0//index of string hello
    var hello="hello"
    for(i in 0..str.length-1){
        if(str[i]==hello[j])
            j++
        if(j==5)
            break
    }
    if(j==5)//size hello (all char of hello is found in str)
        println("YES")
    else
        println("NO")
}