package academy.learnprogramming.onepackage

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

open abstract class Printer(val modelName: String) { //open means it's not final so other classes can extend from it. If it's abstract, open is redundant
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is $modelName") //add final so it cannot be overriten
    override fun bestSellingPrice(): Double = 129.99
}

open class Something: MySubInterface {
    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something {
    constructor(someOtherParameter: String): super(someOtherParameter) { //we can only do that when we don't have primary constructor
        println("I'm in the child's constructor")
    }
}

data class DataClass(val number: Int) { //data class cannot be extended

}

interface MyInterface { //we don't need to use open
    val number: Int
    val number2: Int
        get() = number * 100
    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface {
    fun mySubFunction(num: Int): String
}