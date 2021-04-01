package data_structures.arrays.reverse_string

private fun reverse(string: String): String {
    var result = ""
    for (i in string.length - 1 downTo 0) {
        result += string[i]
    }
    return result
}

// Note: This method uses built-in function called reversed()
private fun reverse2(string: String) = string.reversed()

fun main() {
    println(reverse("Hello, World!"))
    println(reverse2("Hello, World!"))
}