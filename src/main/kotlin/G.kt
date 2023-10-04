fun main(){
    var s=readLine()!!
    var charArr=s.toCharArray()
    for(char in charArr){
        if(char==',')
            print(' ')
        else if(char.isUpperCase())
            print(char.lowercase())
        else
            print(char.uppercase())
    }
}