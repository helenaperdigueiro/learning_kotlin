import java.lang.NumberFormatException

fun main(args: Array<String>) {
    println(getNumber("22.5"))
    println(getNumber("22.5") ?: "Number isn't an Int")
//    println(getNumber("22.5") ?: throw IllegalArgumentException("Number isn't an Int")) example of how to throw an exception with the elvis operator
    println(getNumber("22"))

    notImplementedYet("string")
}

fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch(exc: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}

fun notImplementedYet(something: String): Nothing { //nothing isn't necessary
    throw IllegalArgumentException("Implement me!")
}