class MyQueue {
    
    int[] arr;
    int rear = -1;
    int size = 0;

    public MyQueue(int n){
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }

        return false;
    }

    // Enqueue
    public void add(int data){
        if(rear == size -1){
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return rear;
        }

        int front = arr[0];

        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return rear;
        }

        int front = arr[0];

        return front;
    }
}


class ImplementQueueUsingArray {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

    }
}