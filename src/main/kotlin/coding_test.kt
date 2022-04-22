fun main(args: Array<String>){
//    println("hello world")
//    println(args.contentToString())
//    println(sum(1,2))
//    println(sum1(1,2))
//    val x = 9
//    val y = 3
//    val z = 9
//    val boo1 = true
//    println(x < y)
//    val simpleExpression = 3>4 || 4>3 && 4<=4
//    println(simpleExpression)
//    val hardExpression = !(x != z) && boo1 ||z>(x+y) && (!boo1 || y<z)
//    println(hardExpression)

//    val x =10
//    val y = 7
//    if(x<y) println("$x is lesser than $y")
//    else if(x>y) println("$x is greater than $y")
//    else println("$x is equal to $y")

//    printSum(1,2)
//    printSum2(2,3)
//    var rectangle = Rectangle(5.0,2.0)
//    println("the rectangle is ${rectangle.perimeter}")

    // String templates

//    var a =1
//    var s1 = "a is $a"
//
//    println(s1)
//    a =2
//    val s2 = "${s1.replace("is","was")}, but now is $a"
//    println(s2)
//
//    println(maxOf(1,2))

    // part 15
//    when(readLine()?.toInt()){
//        in 0..5-> println("you're a young kid")
//        in 6..17->println("you're a teenager")
//        18 ->println("Finally, you're 18")
//        19,20 -> println("you're a young adult")
//        in 21..65 ->println("you're a young adult")
//        else -> println("you're really old")
//    }
//
//    when(readLine()){
//        "hi"-> println("you're a young kid")
//        "hello"->println("you're a teenager")
//        "" ->println("Finally, you're 18")
//        else -> println("you're really old")
//    }

//    //part 19
//    println("please enter a number")
//    val input = readLine()?.toInt()

//    println(regression(6))
//
//    //part 20
//    val myRect = Rectangle(2.0,5.0)
//    println(myRect.perimeter())
//    println(myRect.area())

//    //part 21
//    val myTriangle = Triangle(3.0,4.0,5.0)
//    myTriangle.changeName("hello")
//    println(myTriangle.name)
//
//    val myRectangle = Rectangle(4.0,3.0)
//    println(myRectangle.area())
//    println(myRectangle.perimeter())
//
//
//    val myCircle = Circle(4.0)
//    println(myCircle.area())
//    println(myCircle.perimeter())
//    val myRectangle1 = Rectangle(4.0)
//    val myRectangle2 = Rectangle(1,2)
//
//    val circle = Circle.randomCircle()

//    //part27
//    val division = try {
//        divide(4.0,0.0)
//
//    }catch (e:DivisionByZeroExceoption){
//        0.0
//    }
//    println("The result of the division is $division")
//    println("Please enter a number: ")
//    val input = try{
//        readLine()?.toInt()
//    }catch (e: NumberFormatException){
//        0
//    }finally {
//        println("This is from final")
//    }
//    println("you entered: $input")

    val a = 3.0
    val b = 4.0
    val c = 5.0
    val d = 4.0
    val height = 3.87298
    val trapeze = object : Shape("Trapeze",a,b,c,d,height){
        override fun area(): Double {
            return (a+c) * height/2.0

        }

        override fun perimeter(): Double {
            return a+b+c+d
        }
    }

}

class DivisionByZeroExceoption : Exception("you cannot divide by zero")

fun divide(a: Double, b:Double):Double{
    if(b== 0.0){
        throw DivisionByZeroExceoption()
    }
    return a/b
}

fun Int.isPrime():Boolean{
    for(i in 2 until this - 1){
        if(this % i == 0) return false
    }
    return true
}
fun regression( a: Int):Int{
    if(a ==1) return 1
    return a * regression(a-1)
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

