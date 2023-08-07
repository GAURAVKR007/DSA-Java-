import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
 
        if(nums.length == 1){
            return 1;
        }
         
       HashSet<Integer> set = new LinkedHashSet<>();
         Arrays.sort(nums);
 
         for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
         }
 
         ArrayList<Integer> arrayList = new ArrayList<>(set);
 
         ArrayList<Integer> count = new ArrayList<>();
 
         int tempCount = 0;
 
         for(int i = 0; i < arrayList.size()-1 ; i++){
             int temp = arrayList.get(i);
             if(temp + 1 == arrayList.get(i+1)){
                 tempCount++;
             }else{
                 count.add(++tempCount);
                 tempCount = 0;
             }
 
         }
 
         count.add(++tempCount);
         int max = 0;
 
         for(int x : count){
             if(max < x){
                 max = x;
             }
         }
 
         return max;
 
     }

    public static void main(String[] args) {
        int[] arr = {4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3};

        System.out.println(longestConsecutive(arr));
    }
}
