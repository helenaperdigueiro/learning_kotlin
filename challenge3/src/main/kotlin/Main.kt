fun main(args: Array<String>) {
    var bike1 = Bicycle(2, 3, 40)
    var bike2 = Bicycle(3, 45)

    var mountainBike1 = MountainBike(2, 3, 40, 2)
    var mountainBike2 = MountainBike(3, 45, 3)
    var mountainBike3 = MountainBike("blue", 3, 45, 3)

    var roadBike1 = RoadBike(2, 3, 40, 5)
    var roadBike2 = RoadBike(3, 45, 6)

    bike1.printDescription()
    bike2.printDescription()
    mountainBike1.printDescription()
    mountainBike2.printDescription()
    mountainBike3.printDescription()
    roadBike1.printDescription()
    roadBike2.printDescription()

    val availableColors = MountainBike.availableColors
    for (availableColor in availableColors) {
        println(availableColor)
    }
    availableColors.forEach { println(it) }

}