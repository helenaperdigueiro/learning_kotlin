package academy.learnprogramming.onepackage

import java.time.Year

fun main(args: Array<String>) {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)

    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45

    wantsSomeInterface(object: SomeInterface { //the instance created here is used and discarded
        override fun mustImplement(num: Int) = "This is from mustImplement: ${num * 100}"
    })

    wantsSomeInterface(object: SomeInterface { //the instance created here is used and discarded
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)

    println(Department.ACCOUNTING.getDepartmentInfo())
}

object CompanyCommunications { //singleton

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

class SomeClass private constructor(val someString: String){

    companion object SomeCompanion { //equivalent of static. If we don't name it, the default is Companion and we don't need to use it when calling it
        private var privateVar = 6
        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.lowercase())
            } else {
                return SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from academy.learnprogramming.onepackage.wantsSomeInterface ${si.mustImplement(22)}")
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5), IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3), SALES("Sales", 20); //here a semicolon is mandatory because we have function

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"

}

fun topLevel(str: String) = println("Top level function: $str")