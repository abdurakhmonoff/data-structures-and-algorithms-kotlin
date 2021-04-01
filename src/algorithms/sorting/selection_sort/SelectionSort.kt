package algorithms.sorting.selection_sort

fun selectionSort(array: IntArray): IntArray {
    for (i in array.indices) {
        var smallest = i
        for (j in i until array.size) {
            if (array[j] < array[smallest]) {
                smallest = j
            }
        }
        val temp = array[i]
        array[i] = array[smallest]
        array[smallest] = temp
    }
    return array
}

fun main() {
    val numbers = intArrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
    println(selectionSort(numbers).contentToString())
}