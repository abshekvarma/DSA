package Practice;

import java.util.Stack;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node() {}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}

class LinkedList {

    public Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
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
            node = head.getNext();
            if(previous==null){
                previous = new Node(head.getData());
            }else{
                previous.setNext(head.getNext());
            }
        }
        nodeTobeInserted.setNext(node);
        previous.setNext(nodeTobeInserted);
        head=previous;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.setNext(head);
        head=newNode;
    }

    public void deleteAt(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());

    }

    public void display() {
        if (head != null) {
            System.out.println();
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                System.out.print(currentNode.getData());
                currentNode = currentNode.getNext();
            }
            System.out.print(currentNode.getData());
        }
    }

    public void customDisplay(Node node) {
        if (head != null) {
            System.out.println();
            Node currentNode = node;
            while (currentNode.getNext() != null) {
                System.out.print(currentNode.getData());
                currentNode = currentNode.getNext();
            }
            System.out.print(currentNode.getData());
        }
    }

    public Node reverse() {
        if(head==null || head.next==null){
            return head;
        }
        Node prev = head;
        Node current = head.next;
        while(current!=null){
            Node next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head.next=null;
        head = prev;
        return head;
    }

}

public class LinkedListRunner {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.customDisplay(list.reverse());
    }
}
