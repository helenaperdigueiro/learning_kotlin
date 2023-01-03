class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10): Bicycle(cadence, speed, gear) {
    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) : this(seatHeight, cadence, speed, gear)  {
        println("The color is $color")
    }

    companion object {
        val availableColors = listOf<String>("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight mm.")
    }
}