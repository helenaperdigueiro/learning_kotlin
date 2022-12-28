fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    var number = 2988

    val phrase: Any = "The Any type is the root of the Kotlin class hierarchy."
    val castPhrase = phrase as String
    println(castPhrase.toUpperCase())
    if (phrase is String) {
        println(phrase.toUpperCase())
    }

    val oneLineOfCode = """
        |     1
        |    11
        |   111
        |  1111
        | 11111
    """.trimMargin()

    println(oneLineOfCode)

    val usingOneAsTrim = """
        1     1
        1    11
        1   111
        1  1111
        1 11111
    """.trimMargin("1")

    println(usingOneAsTrim)
}