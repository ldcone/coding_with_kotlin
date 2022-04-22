class Rectangle(
    private val height: Double,
    private val length: Double
):Shape("Rectangle", a, b, c, d, height) {

    constructor( a : Double ) : this(a,a)
    constructor(a:Int, b:Int) : this(a.toDouble(),b.toDouble())


    init{
        println("Rectangle created with height = $height and length = $length")
    }

    override fun area() = height * length

    override fun perimeter() = 2 * height +2 * length

    var perimeter = (height + length) *2

}