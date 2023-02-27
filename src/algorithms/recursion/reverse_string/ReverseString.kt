package algorithms.recursion.reverse_string

class ReverseString {

    /**
     * Returns the reverse of the given string using a recursive approach.
     *
     * @param str the string to reverse
     * @return the reverse of the given string
     */
    fun reverseStringRecursive(str: String): String {
        return if (str == "")
            ""
        else
            reverseStringRecursive(str.substring(1)) + str[0]
    }

    /**
     * Returns the reverse of the given string using an iterative approach.
     *
     * @param str the string to reverse
     * @return the reverse of the given string
     */
    fun reverseStringIterative(str: String): String {
        val charArray = str.toCharArray()
        for (i in 0 until charArray.size / 2) {
            val temp = charArray[i]
            charArray[i] = charArray[charArray.size - 1 - i]
            charArray[charArray.size - 1 - i] = temp
        }
        return String(charArray)
    }
}

fun main() {

    val reverse = ReverseString()
    println(reverse.reverseStringRecursive("yoyo mastery"))
    println(reverse.reverseStringIterative("yoyo mastery"))
}