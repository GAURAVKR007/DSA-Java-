class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int k=0;
        int l=0;

        int[] arr = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            if (nums2.length == 0) {break;}

            if(nums1[k] <= nums2[l]){
                if (nums1[k] == 0 && nums2.length > 0){
                    arr[i] = nums2[l];
                    l++;
                    continue;
                }
                arr[i] = nums1[k];
                k++;
            }else {
                if (nums2[l] == 0 && nums2.length > 0){
                    arr[i] = nums1[k];
                    k++;
                    continue;
                }
                arr[i] = nums2[l];
                l++;
            }
        }

        for(int i=0;i<nums1.length;i++){
            if(nums2.length == 0){
                break;
            }
            nums1[i] = arr[i];
        }

        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }


       
    }
}

class MergeSortedArray {
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        int[] arr1 = {2,0};
        int[] arr2 = {1};
        int m = 1; int n = 1;
        sol.merge(arr1, m, arr2, n);
    }
}