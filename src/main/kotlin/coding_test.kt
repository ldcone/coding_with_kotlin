
fun main(args: Array<String>){
    println("hello world")
    println(args.contentToString())
    println(sum(1,2))
    println(sum1(1,2))

    printSum(1,2)
    printSum2(2,3)
    var rectangle = Rectangle(5.0,2.0)
    println("the rectangle is ${rectangle.perimeter}")

    // String templates

    var a =1
    var s1 = "a is $a"

    println(s1)
    a =2
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s2)

    println(maxOf(1,2))

}

fun sum(a:Int, b:Int):Int{
    return a+b
}
fun sum1(a: Int, b:Int) = a+b

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a+b}")
}

fun printSum2(a: Int, b: Int){
    println("sum of $a and $b is ${a+b}")
}

fun maxOf(a: Int, b: Int) = if(a>b) a else b

