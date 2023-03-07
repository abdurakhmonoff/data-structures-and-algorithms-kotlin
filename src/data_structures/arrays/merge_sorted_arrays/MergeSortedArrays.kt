package data_structures.arrays.merge_sorted_arrays

/**
 * This function takes two sorted arrays of integers as input and returns a single sorted array that contains all the elements of both input arrays.
 *
 * @param arr1 First sorted integer array
 * @param arr2 Second sorted integer array
 * @return Single sorted integer array that contains all the elements of both input arrays
 */
fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    // Initialize indices for arr1, arr2, and the merged array
    var i = 0
    var j = 0
    var k = 0
    // Initialize a new array to hold the merged and sorted values
    val mergedArray = IntArray(arr1.size + arr2.size)
    // Compare values from arr1 and arr2 and insert them into the merged array in ascending order
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
    // If arr1 has remaining values, append them to the merged array
    while (i < arr1.size) {
        mergedArray[k] = arr1[i]
        i++
        k++
    }
    // If arr2 has remaining values, append them to the merged array
    while (j < arr2.size) {
        mergedArray[k] = arr2[j]
        j++
        k++
    }
    // Return the merged and sorted array
    return mergedArray
}

fun main() {

    val mergedArray = mergeSortedArrays(intArrayOf(0, 2, 3, 56), intArrayOf(0, 6, 7))
    println(mergedArray.contentToString())
}