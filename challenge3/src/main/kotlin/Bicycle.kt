open class Bicycle(var cadence: Int, var gear: Int, var speed: Int) {
    fun applyBreak(decrement: Int) {
        speed -= decrement
    }
    fun speedUp(increment: Int) {
        speed += increment
    }

}