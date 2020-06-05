package task_1
//Implementation of the function that checks whether a string is a valid identifier.
// A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters,
// digits and underscores.

//Since Kotlin_1.3 args can be omitted in main function
fun main() {
    println(isValidId("name"))   // true
    println(isValidId("_name"))  // true
    println(isValidId("_12"))    // true
    println(isValidId(""))       // false
    println(isValidId("012"))    // false
    println(isValidId("no$"))    // false
}

//If it works, it works. Can be implemented in different ways
fun isValidIdentifier(s: String): Boolean =
    !(s.isEmpty() || s in "0".."9" || s.contains("$"))

//Second implementation
fun isValidId(s: String): Boolean {
    fun checkChar(c: Char) =
        c == '_' || c.isLetterOrDigit()
    if (s.isEmpty() || s[0].isDigit()) return false
    for (i in s) {
        if (!checkChar(i)) return false
    }
    return true
}
