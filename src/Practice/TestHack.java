package Practice;

class LinkedListNode{
    int data;
    LinkedListNode next;
    public LinkedListNode(){};
    public LinkedListNode(int data){
        this.data = data;
    }
}

class LinkedListCustom{
   LinkedListNode head;

   public void insert(int data){
       LinkedListNode node = new LinkedListNode(data);
       if(head == null){
           head = node;
       }else{
           LinkedListNode current = head;
           while(current.next!=null){
               current = current.next;
           }
           current.next = node;
       }
   }

   public void insertAtFirst(int data){
    LinkedListNode node = new LinkedListNode(data);
       if (head != null) {
           node.next = head;
       }
       head = node;
   }

  public void insertAt(int index, int data){
       LinkedListNode node = new LinkedListNode(data);
       LinkedListNode current = head;
       LinkedListNode prev=null;
       if(index==0){
           insertAtFirst(data);
           return;
       }
       for(int i=0; i<index;i++){
           prev = current;
           current = current.next;
       }
       node.next = current;
       prev.next = node;
  }

  public void deleteAt(int index){
       LinkedListNode current = head;
       if(index==0){
           head=head.next;
           return;
       }
       for(int i=0;i<index-1;i++){
           current = current.next;
       }
       current.next = current.next.next;

  }

   public void display(){
       LinkedListNode current = head;
       while(current!=null){
           System.out.print(current.data);
           current = current.next;
       }
       System.out.println();
   }

    public void reverse() {
    }

}
public class TestHack{
    public static void main(String[] args) {
        LinkedListCustom list = new LinkedListCustom();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        list.insertAtFirst(6);
        list.display();
        list.insertAt(3,7);
        list.display();
        //list.deleteAt(0);
        list.reverse();
        list.display();


    }
}