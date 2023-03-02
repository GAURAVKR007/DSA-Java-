class MyLinkistQueue {

    private Node head = null;
    private Node tail = null;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
            return;
        }

        tail.next = newNode;
        tail = newNode; 

    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }

        int res = head.data;
        head = head.next;
        return res;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }

        int res = head.data;
        return res;
    }
}


public class ImplementQueueUsingLinkList {
    public static void main(String[] args) {
        MyLinkistQueue queue = new MyLinkistQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        System.out.println("--" + queue.remove()); 
        System.out.println("--" + queue.remove()); 
        System.out.println("--" + queue.remove()); 
        queue.add(7);
        queue.add(8);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
