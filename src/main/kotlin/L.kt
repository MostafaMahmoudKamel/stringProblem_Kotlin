fun main(){
    //read size of string and number of testCases
    var input=readLine()!!.split(" ")
    var sizeString=input[0].toInt()//stringsize
    var t=input[1].toInt()//testcases
    //read String
    var s=readLine()!!
    repeat(t){
        var list=readLine()!!.split(" ")
        if(list[0]=="substr"){
            var start=list[1].toInt()//start index
            var end=list[2].toInt()//end index
            var sub=s.substring(start-1,end)
            println(sub)
        }
        else if(list[0]=="sort"){
            var start=list[1].toInt()//start
            var end=list[2].toInt()//end
            var charArr=s.toCharArray()

            charArr.sort(start-1,end)
            s=String(charArr)//update charArr =s string-->study it

        }
        else if(list[0]=="pop_back"){
            //s= value because string can't be updated
            s=s.dropLast(1)//remove last char in string -->study it
        }
        else if (list[0]=="back")
            println("${s[s.length-1]}")
        else if(list[0]=="reverse"){
            var start=list[1].toInt()
            var end=list[2].toInt()
            start--
            end-- //to start from 0 index not 1
            var reversedString=reversePartOfString(s,start,end)
            s=reversedString

        }
        else if(list[0]=="front")
            println(s[0])
        else if(list[0]=="print"){
            var index=list[1].toInt()
            println(s[index-1])
        }
        else if(list[0]=="push_back"){
            var newChar=list[1]
            s+=newChar
        }
    }

}
fun reversePartOfString(s:String ,startIndex:Int , endIndex:Int):String{
    var reversedS=s.substring(startIndex,endIndex+1).reversed()
    return s.substring(0,startIndex)+reversedS+s.substring(endIndex+1)//study it
}