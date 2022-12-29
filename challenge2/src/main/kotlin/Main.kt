fun main(args: Array<String>) {

    //non-nullable
    val myFloat: Float = -3847.284f
    val myFloat2 = -3847.284f
    val myFloat3 = (-3847.384).toFloat()

    //nullable
    val myFloat4: Float? = -3847.284f
    val myFloat6: Float? = (-3847.384).toFloat()

    val array1: ShortArray = shortArrayOf(1, 2, 3, 4, 5)
    val array2 = shortArrayOf(1, 2, 3, 4, 5)
    val array3 = arrayOf<Short>(1, 2, 3, 4, 5)

    val array4 = Array<Int?>(200/5) { i -> (i + 1) * 5 }
    for (number in array4) {
        println(number)
    }

    val array5 = charArrayOf('a', 'b', 'c')

    val phrase: String? = "I AM IN UPPERCASE"
    val phrase2: String? = phrase?.lowercase() ?: "I give up!"
    println(phrase2)

    val phrase3: String? = phrase?.let { it.lowercase().replace(" am ", " am not ") }
    println(phrase3)

    val myNonNullVariable: Int? = null
    myNonNullVariable?.toDouble() //doesn't throw null pointer exception
    myNonNullVariable!!.toDouble() //throws a null pointer exception

}