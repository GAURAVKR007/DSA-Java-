class MyCircularQueue {
    
    int[] arr;
    int rear = -1;
    int front = -1;
    int size = 0;

    public MyCircularQueue(int n){
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return (rear+1)%size == front;
    }

    public void add(int data){
        if(isFull()){
            System.out.println("Queue OverFlow");
            return;
        }

        if(front == -1){
            front++;
        }

        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue UnderFlow");
            return -1;
        }

        int last = arr[front];

        if(rear == front){
            rear = front = -1;
        }else{
            front = (front+1)%size;
        }
        
        return last;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue UnderFlow");
            return -1;
        }

        int last = arr[front];
        return last;
    }

}

public class ImplementCircularQueueUsingArray {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);

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
