import kotlinversion.Node;

public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        node.appendToEnd(8);
        node.appendToEnd(9);
        // End of Example
        node.printNodes();
        System.out.println("Length is : "+node.length(node));
        System.out.println("Sum is : "+node.sumOfNodes());
        node.deleteNode(node,7);
        node.printNodes();
    }
}
