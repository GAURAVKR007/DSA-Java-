

public class binary_seach {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int start = 0;
        int last = nums.length-1;
        int index = -1;

        while(start<=last){
            int mid = (start + last) / 2;

            if(nums[mid] == target){
                index = mid;
            }
            
            if(nums[start] <= nums[mid]){

                if(target >= nums[start] && target<nums[mid]){
                    last = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > nums[mid] && target<=nums[last]){
                    start = mid+1;
                }else{
                    last = mid-1;
                }
            }
        }
        

        

        System.out.println(index);
    }
}
