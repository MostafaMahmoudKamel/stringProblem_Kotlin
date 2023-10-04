import kotlin.math.min
import kotlin.system.exitProcess

fun main(){
    //reading two String
    var s1=readLine()!!
    var s2=readLine()!!
    //find minsize string
    var minLength=min(s1.length,s2.length)
    //compare two minlength string such(acc,accdd)it compare acc,acc if equal it will print min length
    if(s1.substring(0,minLength)==s2.substring(0,minLength))
    {
        if(s1.length>s2.length)
            print(s2)
        else
            print(s1)
        exitProcess(0)
    }
    //s1==s2 print any of them
    if(s1==s2){
        print(s1)
    exitProcess(0)
    }
    //compare two string
    var flag=0
    for(i in 0..minLength-1){
        if(s1[i]<s2[i]){
            flag=0
        break
        }
        if(s1[i]>s2[i]){
            flag=1
            break
        }
    }
//output based on flag
    if(flag==0)
        print(s1)
    else
        print(s2)

}