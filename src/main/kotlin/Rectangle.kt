class Rectangle(
    private val height: Double,
    private val length: Double
) {
    init{
        println("Rectangle created with height = $height and length = $length")
    }

    fun area() = height * length

    fun perimeter() = 2 * height +2 * length

    var perimeter = (height + length) *2

}