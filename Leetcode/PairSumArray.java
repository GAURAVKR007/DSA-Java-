import java.util.ArrayList;
import java.util.Collections;

public class PairSumArray {
      public static int getMaximumDigit(int num){
        int max = 0;
        
        while(num > 0){
            int last = num % 10;
            if(max < last){
                max = last;
            }
            
            num = num /10;
        }
        
        return max;
    }
    
    public static boolean doesExist(int num , int digit){
        int max = getMaximumDigit(num);

        if(max == digit){
            return true;
        }
        // while(num > 0){
        //     int last = num % 10;
        //     if(last == digit){
        //         return true;
        //     }
        //     num = num / 10;
        // }
        
        return false;
    }
    
    public static int maxSum(int[] nums) {
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            // if(nums[i] > 9){
                int maxDigit = getMaximumDigit(nums[i]);
                
                for(int j = 0; j<nums.length; j++){
                    boolean valid = false;
                    if( j != i){
                        valid = doesExist(nums[j],maxDigit);
                    }
                    
                    if(valid){
                        sol.add(nums[j]+nums[i]);
                    }
                }
            // }
        }
        
        if(sol.size() == 0){
            return -1;
        }
        
        int max = Collections.max(sol);
        
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {64,33,2,87,2};

        System.out.println(maxSum(nums));
    }
}
