
fun main(){
    var s=readLine()!!
    var words=s.split("username=","&pwd=","&profile=","&role=","&key=")
    println("username: ${words[1]}")
    println("pwd: ${words[2]}")
    println("profile: ${words[3]}")
    println("role: ${words[4]}")
    println("key: ${words[5]}")
}