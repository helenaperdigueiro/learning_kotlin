fun main(args: Array<String>) {

    // access modifiers: private, public, protected, internal - the default is public

    val employee = Employee("John")
    println(employee.firstName)
    println(employee.fullTime)

    val employee2 = Employee("Joe")
    println(employee2.firstName)
    println(employee2.fullTime)

    var employee3 = Employee("Joe", false)
    println(employee3.firstName)
    employee3.firstName = "John"
    println(employee3.firstName)
    println(employee3.fullTime)

    val car = Car("blue", "Toyota", 2015)
    println(car) //we have a default implementation of toString for data classes
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2) //we have a default implementation of equals for data classes
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016) //we can specify what we want to change
    println(car4)
}

// in kotlin all classes are public and final by default

class Employee(var firstName: String, val fullTime: Boolean = true) {

}

data class Car(val color: String, val model: String, val year: Int) {

}