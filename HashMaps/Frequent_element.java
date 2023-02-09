import java.util.*;
import java.util.Map.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){

            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }
            }
           
        }

        int max = (Collections.max(map.values()));
        int maxKey = Integer.MAX_VALUE;
        for(Entry<Integer, Integer> entry : map.entrySet()){
             if (entry.getValue() == max) {
                 if(maxKey > entry.getKey()){
                    maxKey = entry.getKey();
                 }
             }
            
        }
        
        return maxKey;



    }
}





public class Frequent_element {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1,2,2,4,4,1};

       System.out.println(sol.mostFrequentEven(arr)); 
    }
}
