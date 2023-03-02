### Linear search

This function performs a linear search on an array of integers to find the index of a specified key. The algorithm works
by iterating through each element in the array and comparing it to the key until the key is found or the entire array
has been searched.

```kotlin
fun linearSearch(arr: IntArray, key: Int): Int {
    // Loop through each element in the array
    for (i in arr.indices) {
        // If the current element is equal to the key, return its index
        if (arr[i] == key) {
            return i
        }
    }
    // If the loop completes without finding the key, return -1
    return -1
}
```