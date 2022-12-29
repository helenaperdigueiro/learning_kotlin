import java.lang.StringBuilder
import java.math.BigDecimal

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    println("Hello World!")

//    val number = 25
    val number : Int = 25
    println(number)
    var test : Int? //nullable type
    test = null

    val employee1 = Employee("John", 1)
    employee1.name = "John Smith"
//    employee1.id = 2 we can't change because it's val (final variable)
//    employee1 = Employee("Tim", 2) we can't reassign employee1 because it's val

    val employee2 : Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane", 2)
    } else {
        employee2 = Employee("Tim", 2)
    }

    val employees : EmployeeSet //Set<Employee> declared on top

    val names = arrayListOf("John", "Jane", "Tim")
    println(names[1])

    val employee3 = Employee("John", 3)
    val employee4 = Employee("John", 4)
    val employee5 = Employee("John", 4)
    val employee6 = employee5
    println(employee3 == employee4) // structural equality
    println(employee4 == employee5) // structural equality
    println(employee3.equals(employee4)) // structural equality
    println(employee4.equals(employee5)) // structural equality
    println(employee3 === employee4) // referencial equality
    println(employee4 === employee5) // referencial equality
    println(employee5 === employee6) // referencial equality

    println(employee3 != employee4)
    println(employee3 !== employee4)
    println(employee4 != employee5)
    println(employee4 !== employee5)

    val employee: Any = employee1

    if (employee is Employee) { // instead of instanceOf
        println("it's Employee")
    }

    println(employee1)

    val change = 4.22
    println("The change is $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    val filePath = """c:\somedir\somedir""" // we don't have to scape the \ with the triple "

    val eggName = "Humpty"

    val nurseryRhyme = """$eggName Dumpty sat on the wall
        |$eggName Dumpty had a great fall
        |All the king's horses and all the king's men
        |Couldn't put $eggName together again.
    """.trimMargin() // the default value for trimMargin is pipe. We can change if we want to.

    println(nurseryRhyme)

    val myInt = 10
    var myLong = 20L
    val myLong2: Long = 20

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble: Double
    var myFloat = 838.888f

    myDouble = myFloat.toDouble()

    val char = 'b'
    val myChar: Char = 65.toChar()
    println(myChar)

    val myBoolean = true

    val vacationTime = false
    val onVacation = Main().isVacationTime(vacationTime) // you can pass class type as primitive type
    println(onVacation)

    val names2 = arrayOf("John", "Jane", "Jill", "Joe")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    val longs3 = arrayOf(1, 2, 3)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
//    println(longs3 is Array<Long>) it's not array of long, so we can't do that
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers) {
        println(number)
    }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeroes = Array(10) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }
    someArray = Array(6) { i -> i + 1 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }
    println(mixedArray.isArrayOf<Long>())
    println(mixedArray.isArrayOf<Any>())

    val myIntArray = arrayOf(1, 2, 3, 4)
//    Main().printNumbers(myIntArray) type mismatch
    val myIntArray2 = intArrayOf(1, 2, 3, 4) //primitive
    Main().printNumbers(myIntArray2)

//    var someOtherArray = Array<Int>(5) we can't specify the size and not pass the values
    var array1 = IntArray(5) // it'll initialize all elements with 0
    for (element in array1) {
        println(element)
    }

    Main().printNumbers(evenNumbers.toIntArray())

    val convertedIntArray: Array<Int> = myIntArray2.toTypedArray()

    val str: String? = "This isn't null"
    if (str != null) { //foldable if statement
        str.uppercase() //toUpperCase() is deprecated
    }
    str?.uppercase() //it's the same

    val str2: String? = null
    println(str2?.uppercase()) //it doesn't throw the null pointer exception, we just get null - ? safety operator

    // ?: elvis operator
    val str3 = str2 ?: "This is the default value if the other one is null"
    println(str3)

    val something: Any = arrayOf(1, 2, 3, 4)
    val str4 = something as? String // trying to cast an array of int into string - it doesn't work. The ? prevents the cast class exception. as? safe cast operator
    println(str4)
    println(str4?.uppercase()) //we get null and we don't get a null pointer exception

    // !! not null assumption
    val strNotNull: String? = "This isn't null"
    strNotNull!!.uppercase() //we're saying we are sure it's not null

    val strNull: String? = null
//    strNull!!.uppercase() we're saying we are sure it's not null - it's going to throw a null pointer exception

    strNull?.let { printText(it) } // let this happen is strNull is not null

    if (strNull != null) { // this is the same as above
        printText(strNull)
    }

    val strNotNullable: String = "Not nullable"
    println(strNull == strNotNullable) // it allows to do that because == is a safe operator. This doesn't throw a null pointer exception

    val nullableInts = arrayOfNulls<Int?>(5) // we don't need the ? here
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3].toString()) //also null

    val number3: Int? = null
    println(number3.toString()) // we don't get null pointer exception



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class Employee(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}

fun printText(text: String) {
    println(text)
}