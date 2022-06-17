package Practice;

public class Stack {
    int[] arr;
    int top;
    int capacity;

    public Stack(int size){
        arr = new int[size];
        capacity =size;
        top =-1;
    }

    public void push(int data){
        if(top>=capacity-1){
            System.out.println("stack Overflow");
            return;
        }
        arr[++top] = data;
    }

    public void pop (){
        if(top<0){
            System.out.println("stack underflow");
            return;
        }
        top--;
    }
    public void display(){
        for(int v : arr){
            System.out.print(v);
        }
        System.out.println();
    }

    public int peek(){
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        stack.display();
        stack.pop();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.display();
        System.out.println(stack.peek());


    }
}
