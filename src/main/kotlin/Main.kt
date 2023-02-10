fun main(args: Array<String>) {
greetings("Ada")
remainder(87,5)
 addition(45,23,87,90)
    mySelf("I am an open minded person who loves new adventures")
}

fun greetings(name: String){
    println("Hi $name")

}

fun remainder(num1:Int, num2:Int):Int {
    var answer = num1 % num2
    println(answer)
    return(answer)

}


fun addition(num3: Int, num4: Int, num5: Int, num6: Int): Int {
    var sum = num3 + num4 + num5 + num6
    println(sum)
    return(sum)
}
fun mySelf(sentence: String ){
    println("$sentence")




}
