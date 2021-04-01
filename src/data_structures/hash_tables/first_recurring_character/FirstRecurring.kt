package data_structures.hash_tables.first_recurring_character

private fun firstRecurringCharacter(array: IntArray): Int? {
    val hashSet = HashSet<Int>()
    for (element in array) {
        if (hashSet.contains(element)) {
            return element
        } else {
            hashSet.add(element)
        }
    }
    return null
}

fun main() {
    val firstRecurring = firstRecurringCharacter(intArrayOf(2, 5, 5, 2, 3, 5, 1, 2, 4))
    println(firstRecurring)
}