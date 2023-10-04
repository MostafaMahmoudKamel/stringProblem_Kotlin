fun main(){
    var str=readLine()!!
    var words=str.split(" ")
    for(word in words){
        // reverse each word
        if(words.last()==word)//to print space after each word expect last
        print("${word.reversed()}")
        else
            print("${word.reversed()} ")
    }



}