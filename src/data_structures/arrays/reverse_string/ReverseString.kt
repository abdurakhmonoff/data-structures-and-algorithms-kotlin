package data_structures.arrays.reverse_string

/**
 * This function takes a String parameter and returns the reversed version of the input string.
 *
 * @param string String to reverse
 * @return Reversed input string
 */
private fun reverse(string: String): String {
    // Initialize an empty string
    var result = ""
    // Iterate through the characters of the input string in reverse order
    for (i in string.length - 1 downTo 0) {
        // Append each character to the result string to form the reversed string
        result += string[i]
    }
    // Return the resulting reversed string
    return result
}

/**
 * This function uses Kotlin built-in function called reversed().
 *
 * @param string String to reverse
 * @return Reversed input string
 */
private fun reverse2(string: String) = string.reversed()

fun main() {

    println(reverse("Hello, World!"))
    println(reverse2("Hello, World!"))
}