import java.util.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for(int x: tickets){
            if(x == 0){
                continue;
            }
            queue.add(x);
        }

        int count = 0;

        while(!queue.isEmpty()){

            if(queue.peek() == 1 && k==0){
                count++;
                return count;
            }

            if(queue.peek() == 1){
                queue.remove();
                k--;
                count++;
                continue;
            }
            
            if(queue.peek() != 0){
                int ticket = queue.remove();
                queue.add(ticket-1);
                count++;
                k--;

                if(k==-1){
                    k = queue.size() -1;
                } 
                continue;
            }

            
            
        }

        return -1;
    }
}

class BusQueueQuestion {
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        int n = 2;

        Solution sol = new Solution();

        System.out.println(sol.timeRequiredToBuy(arr, n)); 
    }
}