import java.util.*;

class Inter {
    public int[] intersection(int[] nums1, int[] nums2) {
    
        int length = (nums1.length > nums2.length) ? nums1.length : nums2.length;

        int max = (nums1.length > nums2.length) ?  1: 2;

        ArrayList<Integer> arr = new ArrayList<>();
        
        // int count = 0;

        

        for(int i=0,j=0;i<length;i++,j++){
            if(max == 1){
                if(j<nums2.length){
                    if(nums1[i] == nums2[j]){
                        int x = nums1[i];
                        arr.add(x);
                    }
                }
            }else{
                if(j<nums1.length){
                    if(nums1[j]==nums2[i]){
                        int x = nums1[i];
                        arr.add(x);
                    }
                }
            }
        }

        Collections.sort(arr);

        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == arr.get(i+1)){
                arr.remove(i);
            }
        }

        int[] res = new int[arr.size()];

        for(int i = 0;i<res.length;i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}


public class IntersectionArray {
   public static void main(String[] args) {
    
    int[] nums1 = {1,2,2,1};
    int[] nums2 = {2,2};

    int[] arr;

    Inter in = new Inter();

   arr = in.intersection(nums1, nums2);

   for(int x : arr){
    System.out.print(x+ " ");
   }


   }

    
}
