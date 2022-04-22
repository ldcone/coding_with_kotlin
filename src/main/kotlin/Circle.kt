import kotlin.random.Random

class Circle(
    val radius:Double
):Shape("Circle", a, b, c, d, height) {


    constructor(diameter2 : Int) : this(diameter2.toDouble())
    companion object{
        fun randomCircle():Circle{
            val radius = Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init{
        println("$name created with radius = $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    override fun area(): Double {
        return radius * radius * ImportantNumbers.PI
    }

    override fun perimeter(): Double {
        return 2 * radius * ImportantNumbers.PI
    }

}