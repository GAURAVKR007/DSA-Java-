class Solution2 {
    /**
     * @param nums
     * @return
     */
    public int minimumDeletions(int[] nums) {

        if(nums.length == 1) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }

            if(max<nums[i]){
                max = nums[i];
            }
        }

        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(min == nums[i]){
                minIndex = i;
            }

            if(max == nums[i]){
                maxIndex = i;
            }
        }

        int n = nums.length;
        int res1 = ((n - minIndex) > minIndex - 0) ? minIndex+1 : n-minIndex;
        int res2 = ((n- maxIndex) > maxIndex - 0) ? maxIndex+1: n-maxIndex;

        if (minIndex <= n/2 && maxIndex <= n/2){
            int res = minIndex > maxIndex ? minIndex+1:maxIndex+1;
            return res;
        } else if(minIndex >= n/2 && maxIndex >= n/2){
            int res = (minIndex < maxIndex) ? res1 : res2   ;
            return res;
        }

        int maximum = (minIndex>maxIndex) ? minIndex : maxIndex;

        if(res1+res2 > maximum){
            if(res1 == n-minIndex && res2 == n-maxIndex){
                int res = (res1 > res2) ? n-minIndex : n-maxIndex;
                return res; 
            }else if(res1 == minIndex+1 && res2 == maxIndex+1) {
                int res = (res1>res2) ? minIndex+1:maxIndex+1;
                return res;
            } else if(res1 == n-minIndex && res2 == maxIndex+1) {
                int res = (res1>res2) ? minIndex+1:n-maxIndex;
                return res;
            }else if(res1 == minIndex+1 && res2 == n-maxIndex) {
                int res = (res1>res2) ? res1:maxIndex+1;
                return res;
            }
        }

        return res2+res1;
    }
}

class Min_max_Removal {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {3,87,45,56,-1,34,43,78,88,54};
        System.out.println(sol.minimumDeletions(arr));
        
    }
}