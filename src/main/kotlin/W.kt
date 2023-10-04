fun main(){
    var key =      "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/"
    var original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    var num=readLine()!!.toInt()
    var str=readLine()!!
    if(num==1){//encrept
        for(i in 0..str.length-1){
          var orginalIndex=  original.indexOf(str[i])
            print(key[orginalIndex])
        }
        }
    else{
        for(i in 0..str.length-1){

            var keyIndex=key.indexOf(str[i])
        print(original[keyIndex])
        }

    }




}