fun main(args: Array<String>) {
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCC" in stringRange)
    println("ZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    println("Increasing by 1:")

    println("From 1 to 5 increasing by 1")
    for (i in range) {
        println(i)
    }

    println("From 1 to 5 increasing by 1")
    for (i in 1..5) {
        println(i)
    }

    println("From 1 to 5 increasing by 1. 5 is not included")
    for (i in 1 until 5) {
        println(i)
    }

    println("In steps:")

    val stepRange = 3..15
    val stepThree = stepRange.step(3)

    println("From 3 to 15 increasing by 3")
    for (i in stepThree) {
        println(i)
    }

    println("From 1 to 10 increasing by 2")
    for (i in (1..10).step(2)) {
        println(i)
    }

    println("From 1 to 10 increasing by 2")
    for (i in 1..10 step(2)) {
        println(i)
    }

    println("From 1 to 10 increasing by 2")
    for (i in 1..10 step 2) {
        println(i)
    }

    println("From 1 to 10 increasing by 2. 10 is not included")
    for (i in 1 until 10 step 2) {
        println(i)
    }

    println("Reversed:")

    val reversedRange = range.reversed()

    println("Reversed range. From 5 to 1 decreasing by 1")
    for (i in reversedRange) {
        println(i)
    }

    println("Reversed range. From 20 to 15 decreasing by 1")
    for (i in 20 downTo 15) {
        println(i)
    }

    println("Reversed range. From 20 to 5 decreasing by 5")
    for (i in 20 downTo 5 step 5) {
        println(i)
    }


}