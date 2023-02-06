import java.util.Arrays;

class Solution3 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int largest = Integer.MAX_VALUE;
        int j = 1;
        for(int i=0;i<k;i++){
            if(largest > nums[nums.length-j]){
                largest = nums[nums.length-j];
            }
            j++;
        }

        return largest;
    }
}

public class Kth_max {
    public static void main(String[] args) {
        Solution3 sol3 = new Solution3();
        int[] arr = {3,2,3,1,2,4,5,5,6};
        System.out.print(sol3.findKthLargest(arr, 4));
    }
}
