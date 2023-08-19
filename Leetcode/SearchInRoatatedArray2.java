public class SearchInRoatatedArray2 {
    public static boolean search(int[] nums, int target) {
        

        int n = nums.length;
        int start = 0;
        int last = n - 1;

        while(start <= last){
            int mid = (start + last)/2;

            if(nums[mid] == target){
                return true;
            }

            if(nums[mid] == nums[start] && nums[mid] == nums[last])
            {
                start++;
                last--;
                continue;
            }

            if(nums[start] <= nums[mid]){

            if(target >= nums[start] && target < nums[mid]){
                last = mid -1;
            }else{
                start = mid +1;
            }
            
        }else{
                if(target > nums[mid] && target<=nums[last]){
                    start = mid+1;
                }else{
                    last = mid-1;
                }
            }
        
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0;

        System.out.println(search(arr, target));
    }
}
