class RoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10): Bicycle(cadence, speed, gear) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth mm.")
    }
}