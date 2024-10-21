// Polymorphism is of two types in Kotlin - Compile time polymorphism and run time polymorphism

// Here in this code we are showing Run time polymorphism

// Run time polymorphism can be achieved by overriding methods
fun main() {

    val circle : Shape = Circle(2.0)
    val square : Shape = Square(7.5)

    println(circle.area())
    println(square.area())

    val calculateArea = arrayOf(Circle(2.5),Circle(4.0),Square(6.0), Triangle(1.2,3.2))
    calculateAreas(calculateArea)

}

fun calculateAreas(shapes : Array<Shape>){
    for (shape:Shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() : Double{
        return 0.0
    }
}

class Circle(val radius:Double) : Shape(){
    override fun area(): Double{
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape(){
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val base:Double, val height:Double) : Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}

