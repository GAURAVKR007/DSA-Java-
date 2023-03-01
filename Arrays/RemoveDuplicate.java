public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int i = nums[0];
        int j = 1;
        int count = 0;

        for(int k = 0;k<nums.length;k++){
            if(i != nums[k]){
                nums[j++] = nums[k];
                i = nums[k];
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}
