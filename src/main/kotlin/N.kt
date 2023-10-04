fun main(){
    var size=readLine()!!.toInt()
    var s=readLine()!!
    var mx=1
    for(i in 0..size-2){
        if(s[i]!=s[i+1])
            mx++
    }
    println(mx)
}