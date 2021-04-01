package algorithms.sorting.insertion_sort

fun insertionSort(array: ArrayList<Int>) {
    for (i in array.indices) {
        if (array[i] <= array[0]) {
            array.add(0, array.removeAt(i))
        } else {
            if (array[i] < array[i - 1]) {
                for (j in 1 until i) {
                    if (array[i] < array[j]) {
                        array.add(j, array.removeAt(i))
                        break
                    }
                }
            }
        }
    }
}

fun main() {
    val numbers = ArrayList(listOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0))
    insertionSort(numbers)
    println(numbers)
}