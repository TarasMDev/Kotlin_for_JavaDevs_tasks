package task_2

//Sum function as an extension function
//Change the 'sum' function so that it was declared as an extension to List<Int>.
fun main() {
    val sum = listOf(1, 2, 3).sumAsExtension()
    println(sum)    // 6
}

//Extension function that returns the sum of all elements in the list
fun List<Int>.sumAsExtension(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}