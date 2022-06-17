package Practice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(x);
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    public int pop() {
        if(q1.isEmpty()){
            System.out.println("underFlow");
            return -1;
        }
        int data = q1.peek();
        q1.poll();
        return data;
    }

    public int top() {
        if(q1.isEmpty()){
            System.out.println("underFlow");
            return -1;
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

public class StacksUsingQueues {
    public static void main(String[] args) {
    MyStack stack = new MyStack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.pop();
    System.out.println(stack.top());
    }
}
