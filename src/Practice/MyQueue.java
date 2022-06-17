package Practice;

public class MyQueue {

    int[] arr;
    int front;
    int rear;
    int size;
    int count;

    public MyQueue(int size){
        arr = new int[size];
        this.size = size ;
        front =0;
        rear = 0;
        count = 0;
    }

    public void enqueue(int data){
        if(size==0){
            System.out.println("Underflow");
            return;
        }
        arr[rear++] =data;
        count++;
    }

    public int dequeue(){
        if(count==size){
            System.out.println("Overflow");
            return -1;
        }
        int data = arr[front];
        front++;
        count--;
        return data;
    }

    public void display(){
        for(int i = front; i<rear; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public int peek(){
        return arr[front];
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.display();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.display();
        System.out.println(myQueue.peek());

    }
}
