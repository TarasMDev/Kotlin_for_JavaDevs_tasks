package task_1
//Implementation of the function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
// digits and underscores.

//Since Kotlin_1.3 args can be omitted in main function
fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

//If it works, it works. Can be implemented in different ways
fun isValidIdentifier(s: String): Boolean =
    !(s.isEmpty() || s in "0".."9" || s.contains("$"))

