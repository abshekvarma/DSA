package Practice;

public class CircularQueue {
    int front =-1;
    int rear =-1;
    int q[];
    int size=0;

    public CircularQueue(int size){
        this.size=size;
        q = new int[size];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return (rear+1)%size==front;
    }
    public int front(){
       if(isEmpty()) {
           System.out.println("Qeueue is Empty");
           return -1;
       }
       return q[front];
    }

    public int rear(){
        if(isEmpty()) {
            System.out.println("Qeueue is Empty");
            return -1;
        }
        return q[rear];
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full, cannot Enqueue");
            return;
        }
        if(isEmpty())front=0;
        rear=(rear+1)%size;
        q[rear]=val;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty, cannot Dequeue");
            return;
        }
        int res = q[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
    }

    public void display(){
        System.out.println();
        for(int i=front;i<=rear;i++){
            System.out.print(" "+q[i]);
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(6);
        queue.front();
        queue.rear();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.display();
    }
}
