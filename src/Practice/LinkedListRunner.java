package Practice;

class Node {
    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
}

class LinkedList {

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void insertAt(int index, int data) {
        Node nodeTobeInserted = new Node(data);
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        nodeTobeInserted.setNextNode(node.getNextNode());
        node.setNextNode(nodeTobeInserted);
    }

    public void deleteAt(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void display() {
        if (head != null) {
            System.out.println();
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                System.out.print(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.print(currentNode.getData());
        }
    }

    public void customDisplay(Node node) {
        if (head != null) {
            System.out.println();
            Node currentNode = node;
            while (currentNode.getNextNode() != null) {
                System.out.print(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.print(currentNode.getData());
        }
    }

    public Node reverse() {
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null) {
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

}

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.display();
        list.customDisplay(list.reverse());
    }
}
