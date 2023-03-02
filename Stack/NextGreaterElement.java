import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        int[] res = new int[nums1.length];
        int count = 0;
        for(int i=0;i<nums1.length;i++){
            s.push(nums1[i]);
        }

        while(!s.isEmpty()){
            int top = s.pop();

            for(int i=0;i<nums2.length;i++){
                if(top == nums2[i]){
                    if(i == nums2.length -1){
                        res[count++] = -1; 
                        continue;
                    }

                    if(nums2[i] > nums2[i+1]){
                        res[count++] = -1; 
                    }

                    if(nums2[i] < nums2[i+1]){
                        res[count++] = nums2[i+1]; 
                    }

                }
            }
        }

        return res;
    }
}

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] sol;

        int[] arr1 = {2,4};
        int[] arr2 = {1,2,3,4};

        Solution soltion = new Solution();

        sol = soltion.nextGreaterElement(arr1, arr2);

        for(int i=0;i<sol.length;i++){
            System.out.print(sol[i]+" ");
        }
    }
}
