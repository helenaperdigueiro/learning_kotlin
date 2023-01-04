fun main(args: Array<String>) {
    for (i in 5..50 step 5) {
        println(i)
    }
    for (i in -5..0) {
        println(i)
    }

    println("First 15 in the Fibonacci sequence:")
    var beforeLast = 0
    var last = 1
    println(beforeLast)
    println(last)
    for (i in 1..13) {
        val current = last + beforeLast
        println(current)
        beforeLast = last
        last = current
    }

    println("Change the code to print only 1, 11, 100, 99, 98, 2")
    for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        jfor@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    break@jfor
                }
            }
        }
    }

    println("Change the code to print only 1, 11, 100, 99, 98, 2 - second solution")
    ifor@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@ifor
                }
            }
        }
    }

    println("3rd exercise")
    val num = 10
    val dnum = if (num > 100) {
        -234.567
    } else if (num < 100) {
        4444.555
    } else if (num == 100) {
        0.0
    } else {
        -1
    }

    println(dnum)

    println("Other solution for the 3rd exercise")
    val dnum2 = when {
        num > 100 -> 1
        num < 100 -> 2
        num == 100 -> 3
        else -> 0
    }

    println(dnum2)
}