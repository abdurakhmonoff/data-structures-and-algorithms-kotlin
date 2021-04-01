package algorithms.sorting.bubble_sort

fun bubbleSort(array: IntArray) {
    for (i in array.indices) {
        for (j in 0 until array.size - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

fun main() {
    val numbers = intArrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
    bubbleSort(numbers)
    println(numbers.contentToString())
}