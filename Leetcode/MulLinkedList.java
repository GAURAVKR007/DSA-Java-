import java.math.BigInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MulLinkedList {
    public ListNode doubleIt(ListNode head) {
        ListNode curr = head;
        
        String num = "";
        
        while(curr != null){
            String last = Integer.toString(curr.val);
            num = num+ last;
            curr = curr.next;
        }
        
        BigInteger big = new BigInteger(num);
        BigInteger multiplier = new BigInteger("2");
        BigInteger result = big.multiply(multiplier);
        ListNode prev = head;
        String resultStr = result.toString();
        
        curr = head;
        
        for(int i=0;i<resultStr.length() ; i++){
            
             char charValue = resultStr.charAt(i);
            int val = Character.getNumericValue(charValue);
            
            

            if(curr == null){
                ListNode newNode = new ListNode(val);
                prev.next = newNode;
                newNode.next = null;
                continue;
            }

            if(curr.next == null){
                prev = curr;
            }
            
            curr.val = val;
            curr = curr.next;
        }
        
        return head;
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3
        ListNode head = new ListNode(9);
        head.next = new ListNode(9);
        head.next.next = new ListNode(9);

        MulLinkedList solution = new MulLinkedList();
        System.out.println("Original linked list:");
        solution.printList(head);

        // Double the value of the linked list
        ListNode newHead = solution.doubleIt(head);

        System.out.println("Linked list after doubling the value:");
        solution.printList(newHead);
    }
}

