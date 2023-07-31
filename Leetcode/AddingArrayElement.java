import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class AddingArrayElement {

    public static int minOperations(int[] arr, int n, int k) {
        // code here    
        
        // Arrays.sort(arr);

        // ArrayList<Integer> array = new ArrayList<Integer>();
        // for(int x: arr){
        //     array.add(x);
        // }
        
        // int i = 0;
        // int count = 0;

        // while(array.get(i) < k){
        //     if(array.size() < 2){
        //         return -1;
        //     }
        //     array.set(i, array.get(i) + array.get(i+1));
        //     array.remove(i+1);
        //     count++;
            
        //     if(array.get(i) >= k){
        //         Collections.sort(array);
        //         continue;
        //     }
        //     Collections.sort(array);
        // }
        
        // PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        //     Arrays.sort(arr);
        // for(int x: arr){
        //     pQueue.add(x);
        // }

        // int count = 0;
        // while(pQueue.peek() < k && pQueue.size() > 1){
        //     pQueue.add(pQueue.poll() + pQueue.poll());
        //     count++;
        // }

        // if(pQueue.peek() < k){
        //     return count;
        // }
        
        // return -1;

        // Arrays.sort(arr);

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for(int x: arr){
            queue.add(x);
        }

        int count = 0;

        while(queue.size() > 1 && queue.peek() < k){
            count++;
            int x = queue.peek();
            queue.poll();
            int y = queue.peek();
            queue.poll();

            queue.add(x+y);
        }

        if(queue.peek() < k){
            return -1;
        }

        return count;

        // int i = 0;
        // int count = 0;

        // while(arr[i] < k && i < arr.length){
        //     if(i >= arr.length){
        //         return -1;
        //     }

        //     arr[i+1] = arr[i] + arr[i+1];
        //     count++;

        //     if(arr[i+1] < k){
        //         i++;
        //     }else{
        //         i = i+2;
        //     }
        // }

        // return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,8};
        int n = arr.length;
        int k = 7;

        int oper = minOperations(arr, n, k);

        System.out.println(oper);
    }
}
