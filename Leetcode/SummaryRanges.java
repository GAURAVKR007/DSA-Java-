import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        
        
        for(int i = 0; i < nums.length; i++){
            int next = nums[i] + 1;
            String str = "";
            int start = i;
            int end = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] != next){
                    break;
                }

                end = j;
                
                next++;

                
            }

            // start = i;
            i = end;

            if(start == end){
                str = Integer.toString(nums[start]);
            }else{
                str = Integer.toString(nums[start]) + "->"+ Integer.toString(nums[end]);
            }

            res.add(str);

        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,6,8,9};

        List<String> ans = summaryRanges(arr);

        for(String x : ans){
            System.out.println(x);
        }
    }
}
