import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {
    val num = if (1 > 2) 50 else 592
    println(num)

    val num2 = if (1 > 2) {
        println("something")
        50
    } else { //else is mandatory here
        println("something else")
        592
    }
    println(num2)

    val num3 = 100

    when(num3) { //switch
        100, 200 -> println("100 or 200")
        300 -> println("200")
        400 -> println("300")
        in 401..500 -> println("in range 401 to 500")
        else -> println("Doesn't match any")
    }

    val num4 = 10

    when(num3) { //switch
        num4 + 80 -> println("90")
        num4 + 90 -> println("100")
        400 -> println("300")
        else -> println("Doesn't match any")
    }

    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45

    val something: Any = obj2
    if(something is String) {
        println(something.uppercase())
    } else if (something is BigDecimal) {
        println(something.remainder(BigDecimal(10.5)))
    } else if (something is Int) {
        println(something - 22)
    }

    when (something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println(something - 22)
    }

    val z = when (something) {
        is String -> println(something.uppercase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println(something - 22)
        else -> println("I have no idea what type this is")
    }
    println(z) //Unit

    val z2 = when (something) {
        is String -> {
            println(something.uppercase())
            1
        }
        is BigDecimal -> {
            println(something.remainder(BigDecimal(10.5)))
            2
        }
        is Int -> {
            println(something - 22)
            3
        }
        else -> {
            println("I have no idea what type this is")
            4
        }
    }
    println(z2)

    val timeOfYear = Season.WINTER
    val str = when (timeOfYear) {
        Season.SPRING -> "Flowers are blooming"
        Season.SUMMER -> "It's hot"
        Season.FALL -> "It's getting cooler"
        Season.WINTER -> "I need a coat"
    } //here we don't need else because we're using enum
    println(str)

}