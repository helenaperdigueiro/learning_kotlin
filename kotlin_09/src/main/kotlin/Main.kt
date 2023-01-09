import java.lang.StringBuilder
import java.math.BigDecimal

fun main(args: Array<String>) {
    val strings = listOf("winter", "spring", "summer", "fall") //immutable list
    println(strings.javaClass)

    val emptyList = emptyList<String>()
    println(emptyList.javaClass) //kotlin.collections.EmptyList

    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1, 2, 3) //mutable list
    println(arrayList.javaClass)

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)

    val array = arrayOf("black", "red", "green")
    println("$array ${array.javaClass}")
    val colorsList = listOf(*array) //spread operator to unpack the array
    println("$colorsList ${colorsList.javaClass}")
    val colorsList2 = array.toList()
    println("$colorsList2 ${colorsList2.javaClass}")

    val ints = intArrayOf(1, 2, 3)
    val intsList = ints.toList()
    println("$intsList ${intsList.javaClass}")

    println(strings.last())
    println(strings.asReversed())
    println(strings)
    println(strings.getOrNull(5))

    val ints2 = listOf(1, 2, 3, 4, 5)
    println(ints2.max())

    println(colorsList.zip(strings)) //creates a list of pairs -> [(black, winter), (red, spring), (green, summer)]

    val mergedLists = listOf(colorsList, strings) // [[black, red, green], [winter, spring, summer, fall]]
    println(mergedLists)

    val combinedLists = colorsList + strings // [black, red, green, winter, spring, summer, fall]
    println(combinedLists)

    val strings2 = listOf("winter", "spring", "summer", "fall", "summer")
    val colors2 = listOf("black", "blue", "red", "green", "black", "red")

    val noDupsList = colors2.union(strings2)
    println(noDupsList)

    val noDupColors = colors2.distinct()
    println(noDupColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other value")
    println(mutableSeasons)

    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Ford", 2013))

    println("$immutableMap ${immutableMap.javaClass}")

    val mutableMap = mutableMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012))
    println("$mutableMap ${mutableMap.javaClass}")

    val mutableMap2 = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012))
    println("$mutableMap2 ${mutableMap2.javaClass}")
    mutableMap2.put("Mary's car", Car("red", "Corvette", 1965))
    println("$mutableMap2 ${mutableMap2.javaClass}")

    val pair = Pair(10, "ten")
    val firstValue = pair.first
    val secondValue = pair.second
    val (firstValue2, secondValue2) = pair
    println(firstValue2)
    println(secondValue2)

    for (entry in mutableMap) {
        println(entry.key)
        println(entry.value)
    }

    for ((key, value) in mutableMap) {
        println(key)
        println(value)
    }

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")

    val car2 = Car2("blue", "Corvette", 1959)
    val (color2, model2, year2) = car2
    println("color = $color2, model = $model2, year = $year2")

    val setInts = setOf(1, 2, 3, 4, 5)
    println(setInts.plus(6))
    println(setInts.plus(1))
    println(setInts.minus(1))
    println(setInts.minus(6))
    println(setInts.average())
    println(setInts.drop(3))

    val mutableSetInts = mutableSetOf(1, 2, 3, 4, 5)
    mutableSetInts.add(6)
    mutableSetInts.plus(7) //it doesn't change the set
    println(mutableSetInts)

    println(setInts.filter { it % 2 != 0 })

    println(immutableMap.filter { it.value.year == 2016 })

    println(mutableMap.filter { it.value.color == "red" })

    val ints3 = arrayOf(1, 2, 3, 4, 5)
    val add10List: MutableList<Int> = mutableListOf()
    for (i in ints3) {
        add10List.add(i + 10)
    }
    println(add10List)

    val add10List2 = ints3.map { it + 10 }
    println(add10List2)

    println(immutableMap.map { it.value.year })
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })

    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.model })
    println(immutableMap.toSortedMap())
    println(cars.sortedBy { it.year })

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }.map { it.value.color }) //stream

    println("---")
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .toList()
    println("---")
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith('E') }
    println("---")
    listOf("Joe", "Mary", "Jane")
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith('E') }
    println("---")

    val list = mutableListOf("Hello")
    list.add("another string")
    printCollection(list)
    list.printCollection2()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    printCollection(bdList)
    bdList.printCollection2()

    val ints4 = listOf(1, 2, 3)
    val shorts4: List<Short> = listOf(10, 20, 30)
    val floats4: List<Float> = listOf(10.1f, 20.1f, 30.1f)

    convertToInt(ints4)
    convertToInt(shorts4)
    convertToInt(floats4)

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    val shorts5: List<Short?> = listOf(10, 20, 30)
    val floats5: List<Float?> = listOf(10.1f, 20.1f, 30.1f)

    printCollection(shorts5)
    printCollection(floats5)

    //test

}

class Car(val color: String, val model: String, val year: Int) {
    operator fun component1() = color //these make the class des constructable
    operator fun component2() = model
    operator fun component3() = year
}

data class Car2(val color: String, val model: String, val year: Int) { //data class are des constructable
}

fun <T> printCollection(collection: List<T>) { //the default is Any?
    for (item in collection) {
        println(item)
    }
}

fun <T> List<T>.printCollection2() { //extension function
    for (item in this) {
        println(item)
    }
}

fun <T: Any> printCollection3(collection: List<T>) { //if we want not nullable type we need to specify
    for (item in collection) {
        println(item)
    }
}

fun <T: Number> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun <T> append(item1: T, item2:T)
    where T: CharSequence, T: Appendable {
        println("Result is ${item1.append(item2)}")
    }