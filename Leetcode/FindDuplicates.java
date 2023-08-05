public class FindDuplicates {

    public static int findDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]);

            if(nums[idx] < 0){
                return idx;
            }

            nums[idx] = -nums[idx];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,2};

        int num = findDuplicate(arr);

        System.out.println(num);
    }
}
