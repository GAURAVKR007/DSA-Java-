class LL{

    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add-first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //Print
    public void printList() {
        if(head==null){
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //Delete first/last
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;

        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("A");
        list.addFirst("Is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("this");
        System.out.println(list.getSize());
        list.printList();
        list.deleteLast();
        System.out.println(list.getSize());
        list.printList();
    }
}