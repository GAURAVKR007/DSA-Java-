import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() >= 2){
                minHeap.add(e.getKey());
                minHeap.add(e.getKey());
            }else{
                minHeap.add(e.getKey());
            }
        }

        int size = minHeap.size();

        for(int i=0;i<size;i++){
            nums[i] = minHeap.remove();
        }

        return size;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};

        int[] expected = {1,1,2,2,3};

        int k = removeDuplicates(arr);

        // if(k == expected.length){
            for (int i = 0; i < k; i++) {
              if(arr[i] == expected[i]){
                System.out.println(arr[i]);
              }
            }
        // }

    }
}
