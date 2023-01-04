fun main(args: Array<String>) {
    run { println("I'm in a lambda!") }

    val employees = listOf(Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002))
    println(employees.minBy { e -> e.startYear })
    println(employees.minBy { it.startYear }) //this is the same
    println(employees.minBy(Employee::startYear)) //this is the same

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Whatever")

    findByLastName2(employees, "Wilson")
    findByLastName2(employees, "Whatever")

    findByLastName3(employees, "Wilson")
    findByLastName3(employees, "Whatever")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(uppercase()) //we can use this. if we want to, but no need
            println(this@somestring.lowercase())
        }
    }

    var num = 10
    run {
        num += 15
        println(num)
    }

    run(::topLevel)

    println(countTo100())

}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {
}

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
//        println(num++) we can't do that because parameters are val by default
    }
}

fun topLevel() = println("I'm in a function!")

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i, ", ")
    }
    numbers.append(100)
    return numbers.toString()
}

fun countTo1002(): String {
    val numbers = StringBuilder()
    return with(numbers) {
        for (i in 1..99) {
            append(i, ", ") //we don't need to refer to the receiver
        }
        append(100)
        toString()
    }
}

fun countTo1003() = with(StringBuilder()) {//this is the more concise version
        for (i in 1..99) {
            append(i, ", ") //we don't need to refer to the receiver
        }
        append(100)
        toString()
    }

fun countTo1004() = StringBuilder().apply() {//this is the more concise version
    for (i in 1..99) {
        append(i, ", ") //we don't need to refer to the receiver
    }
    append(100)
}.toString()

fun findByLastName(employees: List<Employee>, lastName: String) {
    for (employee in employees) {
        if (employee.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName: $employee")
            return
        }
    }
    println("No, there's no employee with the last name $lastName")
}

fun findByLastName2(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName: $it")
            return
        }
    }
    println("No, there's no employee with the last name $lastName")
}

fun findByLastName3(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName: $it")
            return@returnBlock //makes it a local return
        }
    }
    println("No, there's no employee with the last name $lastName")
}