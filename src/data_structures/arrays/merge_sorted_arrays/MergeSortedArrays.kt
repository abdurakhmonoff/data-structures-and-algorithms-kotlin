package data_structures.arrays.merge_sorted_arrays

fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    var i = 0
    var j = 0
    var k = 0

    val mergedArray = IntArray(arr1.size + arr2.size)

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            mergedArray[k] = arr1[i]
            i++
        } else {
            mergedArray[k] = arr2[j]
            j++
        }
        k++
    }

    while (i < arr1.size) {
        mergedArray[k] = arr1[i]
        i++
        k++
    }

    while (j < arr2.size) {
        mergedArray[k] = arr2[j]
        j++
        k++
    }

    return mergedArray
}

fun main() {
    val mergedArray = mergeSortedArrays(intArrayOf(0, 2, 3, 56), intArrayOf(0, 6, 7))
    println(mergedArray.contentToString())
}