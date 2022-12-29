fun main(args: Array<String>) {

    // access modifiers: private, public, protected, internal - the default is public

    val employee = Employee("John")
    println(employee.firstName)
    println(employee.fullTime)

    val employee2 = Employee("Joe")
    println(employee2.firstName)
    println(employee2.fullTime)

    val employee3 = Employee("Joe", false)
    println(employee3.firstName)
    println(employee3.fullTime)


}

// in kotlin all classes are public and final by default

class Employee(val firstName: String, val fullTime: Boolean = true) {

}