class Solution4 {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        int[] result = new int[nums.length]; 

        for(int i=0;i<nums.length/2;i++){
            arr1[i] = nums[i]; 
            arr2[i] = nums[i+n];
        }

        result[0] = nums[0];
        int k=0;
        int l = 1;

        for(int i = 1;i<nums.length;i++){
            if(i%2!=0){
                result[i] = arr2[k];
                k++;
            }else{
                result[i] = arr1[l];
                l++;
            }
        }

        return result;
    }
}

class ShuffleArray {
    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        int[] nums = {2,5,1,3,4,7};
        int n=3;
        int[] res = sol4.shuffle(nums, n);
        for(int i=0;i<nums.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}