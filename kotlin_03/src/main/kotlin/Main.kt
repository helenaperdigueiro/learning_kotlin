fun main(args: Array<String>) {
    println(labelMultiply(3, 4))
    println(labelMultiply(label = "The result is:", operand1 = 3, operand2 = 4))

    val employee = Employee("Jane")
    println(employee.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("gray", "Honda", 2017)

    printColors(car1, car2, car3, str = "Color:")

    val numbers = arrayOf(1, 2, 3)

    val manyCars = arrayOf(car1, car2, car3)
//    printColors(manyCars) in java we could pass the array. In kotlin we can't
    printColors(*manyCars, str = "Color:") //spread operator

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(manyCars, moreCars, car4)
    val lotsOfCars2 = arrayOf(*manyCars, *moreCars, car4) //unpack the arrays using the spread operator
    for (c in lotsOfCars) {
        println(c)
    }
    for (c in lotsOfCars2) {
        println(c)
    }

    val test = "this is a test"
    println(Utils().upperFirstAndLast(test))
    println(test.upperFirstAndLast2()) //as if the function we created belonged to the String class
}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The answer is:") =
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {
    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color: String, val model: String, val year: Int) {

}

fun printColors(vararg cars: Car, str: String) {
    for (car in cars) {
        println("$str ${car.color}")
    }
}

fun String.upperFirstAndLast2(): String { //extension function
    val upperFirst = substring(0, 1).uppercase() + substring(1)
//    val upperFirst = this.substring(0, 1).uppercase() + this.substring(1) the same thing
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring((upperFirst.length - 1), upperFirst.length).uppercase()
}