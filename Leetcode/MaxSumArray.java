import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxSumArray {
    public static int sum(List<Integer> arr){
        int sum = 0;
        for(int x : arr){
            sum = sum + x;
        }
        
        return sum;
    } 
        
    public static int maxsum(List<Integer> arr){
        int max = 0;
        int val = 0;

        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) > val){
                val = arr.get(i);
                max = i;
            }
        }

        return max;
    }
        
        
    public static int minimumTime(List<Integer> nums1, List<Integer> nums2, int x) {
        
        int sec = 0;
        // int i=0;
        int sumArr = sum(nums1);
        
        if(sum(nums2) > 2*x){return -1;}
        
        while(sumArr > x){

            int maxIndex = maxsum(nums1);
            
            for(int k = 0; k<nums1.size();k++){
                if(k == maxIndex){
                    nums1.set(maxIndex,0);
                    continue;
                }
                
                nums1.set(k,nums1.get(k) + nums2.get(k));
            }
            
            sumArr = sum(nums1);
            sec++;
            
            // i++;
            
            // if(i == nums1.size()){
            //     i=0;
            // }
            
        }
        
        return sec;
        
    }
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<Integer>();
        nums1.add(4);
        nums1.add(4);
        nums1.add(9);
        nums1.add(10);

        List<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(4);
        nums2.add(4);
        nums2.add(1);
        nums2.add(3);

        int x = 16;

        int sec = minimumTime(nums1, nums2, x);

        System.out.println(sec);


    }
}
