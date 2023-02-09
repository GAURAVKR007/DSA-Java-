import java.util.ArrayList;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=n-k;i<n;i++){
    	    arr.add(nums[i]);
    	}

        	for(int i=0;i<n-k;i++){
    	    arr.add(nums[i]);
    	}

        for(int i=0;i<n;i++){
    	    nums[i] = arr.get(i);
    	}
    }
}

class RotateArray {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,2,3,4,5,6,7};
        sol.rotate(arr,3);
    }
}