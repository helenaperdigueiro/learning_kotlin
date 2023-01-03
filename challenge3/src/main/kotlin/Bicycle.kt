open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }
    fun speedUp(increment: Int) {
        speed += increment
    }
    open fun printDescription() = println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")

}