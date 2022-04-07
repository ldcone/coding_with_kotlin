
fun main(args: Array<String>){
    println("hello world")
    println(args.contentToString())
    println(sum(1,2))
    println(sum1(1,2))

    printSum(1,2)
    printSum2(2,3)
    var rectangle = Rectangle(5.0,2.0)
    print("the rectangle is ${rectangle.perimeter}")

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