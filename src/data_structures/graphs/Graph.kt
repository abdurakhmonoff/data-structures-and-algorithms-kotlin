package data_structures.graphs

import java.util.*
import kotlin.collections.ArrayList

class Graph(var numberOfNodes: Int = 0, var adjacentList: Hashtable<Int, ArrayList<Int>> = Hashtable()) {
    fun addVertex(node: Int) {
        adjacentList[node] = ArrayList()
        numberOfNodes++
    }

    fun addEdge(node1: Int, node2: Int) {
        adjacentList[node1]?.add(node2)
        adjacentList[node2]?.add(node1)
    }

    fun showConnections() {
        val keys: Array<Any> = adjacentList.keys.toTypedArray()
        for (key in keys) {
            println(key.toString() + " --> " + adjacentList[key.toString().toInt()])
        }
    }
}

fun main() {
    val graph = Graph()
    graph.addVertex(5)
    graph.addVertex(54)
    graph.addVertex(44)
    graph.addEdge(5, 54)
    graph.addEdge(5, 44)
    graph.showConnections()
}