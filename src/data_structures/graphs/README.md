### Graphs

Graph is a data structure that consists of a collection of nodes, also known as vertices, connected by edges. Graphs are
a fundamental data structure used in many applications, such as social networks, web page ranking, transportation
networks, and more. In a graph, nodes represent objects, and edges represent the relationships between them. Graphs can
be either directed or undirected, depending on whether the edges have a direction or not. They can also be weighted or
unweighted, depending on whether the edges have a value or not. Here's how we can implement a graph data structure:

```kotlin
class Graph(
    var numberOfNodes: Int = 0,
    var adjacentList: Hashtable<Int, ArrayList<Int>> = Hashtable()
) {

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
```