package kotlinversion

class Node(var data: Int) {

    var currentNode : Node? = null
    var nextNode: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.nextNode != null) {
            n = n.nextNode
        }
        n.nextNode = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        currentNode = this
        while(currentNode != null){
            println("Node : ${currentNode!!.data}")
            currentNode = currentNode!!.nextNode
        }
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        currentNode = h
        var count : Int = 0
        while(currentNode != null){
            count++
            currentNode = currentNode!!.nextNode
        }
        return count
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        currentNode = this
        var sum : Int = 0
        while(currentNode != null){
            sum += currentNode!!.data
            currentNode = currentNode!!.nextNode
        }
        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if(n.data == data) {
            return head.nextNode
        }
        var prev = head
        var current = head
        var next = head.nextNode

        while (next!!.data != data) {
            prev = next
            next = next.nextNode
        }
        // TODO:: Implement the proper loop in order to remove given data
        prev.nextNode = next.nextNode
        //
        return head
    }
}