package Practice;

import java.util.Stack;

class CustomQueue {

    Stack<Integer> q1;
    Stack<Integer> q2;
    int peek;
    public CustomQueue() {
        q1 = new Stack<>();
        q2 = new Stack<>();
    }

    public void add(int x) {
       q1.push(x);
    }

    public int pop() {
    while(!q1.empty()){
        q2.push(q1.pop());
    }
    int x = q2.pop();
    peek=q2.peek();
    while(!q2.empty()){
        q1.push(q2.pop());
    }
    return x;
    }

    public int peek() {
        return peek;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class QueuesUsingStacks {
    public static void main(String[] args) {
    CustomQueue queue = new CustomQueue();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    System.out.println(queue.pop());
    System.out.println(queue.pop());
    queue.add(5);
    System.out.println(queue.pop());
    System.out.println(queue.pop());
    System.out.println(queue.peek());
    System.out.println(queue.empty());
    }
}
