fun main(){
    var t =readLine()!!.toInt()
    repeat(t){
        var s=readLine()!!
        var flag=0
//        for(i in 0..s.length-3){
//
//            if((s[i]=='0'&&s[i+1]=='1'&&s[i+2]=='0')
//                ||(s[i]=='1'&&s[i+1]=='0'&&s[i+2]=='1')){
//                flag=1
//                break
//            }
            if(s.contains("010")||s.contains("101")){
                flag=1

            }
//        }
        if(flag==0)
            println("Bad")
        else
            println("Good")
    }
}