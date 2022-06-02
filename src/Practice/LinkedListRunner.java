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
        if(index==0){
            insertAtFirst(data);
            return;
        }
        Node nodeTobeInserted = new Node(data);
        Node node = null;
        Node previous = null;
        for (int i = 1; i <=index; i++) {
            node = head.getNextNode();
            if(previous==null){
                previous = new Node(head.getData());
            }else{
                previous.setNextNode(head.getNextNode());
            }
        }
        nodeTobeInserted.setNextNode(node);
        previous.setNextNode(nodeTobeInserted);
        head=previous;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head=newNode;
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
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }

    public void customDisplay(Node node) {
        if (head != null) {
            System.out.println();
            Node currentNode = node;
            while (currentNode.getNextNode() != null) {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
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
        list.insertAt(3,86);
        list.display();
        //list.customDisplay(list.reverse());
    }
}
