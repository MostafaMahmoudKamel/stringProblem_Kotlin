fun main(){
    var s=readLine()!!
    var arr=IntArray(150){0}
//    var arr=MutableList(0){0}

    for(char in s){
        var intChar=char.code
        arr[intChar]++//arr[a]++
    }


    for(char in 'a'..'z'){
        var intChar=char.code
        if(arr[intChar]>0)
        {
            println("${char} : ${arr[intChar]}")
        }
    }

}