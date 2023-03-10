package data_structures.graphs

import java.util.*
import kotlin.collections.ArrayList

/**
 * A Kotlin class that represents an undirected graph using an adjacency list.
 *
 * @property numberOfNodes The number of nodes in the graph.
 * @property adjacentList The adjacency list that stores the connections between nodes.
 */
class Graph(
    var numberOfNodes: Int = 0,
    var adjacentList: Hashtable<Int, ArrayList<Int>> = Hashtable()
) {

    /**
     * Adds a new vertex (node) to the graph.
     * @param node The node to be added to the graph.
     */
    fun addVertex(node: Int) {
        adjacentList[node] = ArrayList()
        numberOfNodes++
    }

    /**
     * Adds an edge between two nodes in the graph.
     * @param node1 The first node of the edge.
     * @param node2 The second node of the edge.
     */
    fun addEdge(node1: Int, node2: Int) {
        adjacentList[node1]?.add(node2)
        adjacentList[node2]?.add(node1)
    }

    /**
     * Prints out the adjacency list that stores the connections between nodes in the graph.
     */
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