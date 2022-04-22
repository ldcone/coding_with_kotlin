abstract class Shape(
    var name: String,
    
) {
    abstract val d: Double

    constructor(name:String,
                a: Double,
                b: Double,
                c: Double,
                d: Double,
                height: Double) : this(name)

    init{
        println("I am the super class!")
    }
    abstract fun area() : Double
    abstract fun perimeter() : Double

    fun changeName(newName:String){
        name = newName
    }
}
