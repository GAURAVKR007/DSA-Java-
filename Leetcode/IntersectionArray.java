import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArray {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();

        int idx1 = 0;
        int idx2 = 0;

        while(idx1 < nums1.length && idx2 < nums2.length){
            if(nums1[idx1] == nums2[idx2]){
                list.add(nums1[idx1]);
                idx1++;idx2++;
                continue;
            }

            if(nums1[idx1] < nums2[idx2]){
                idx1++;
            }else{
                idx2++;
            }
        }

        int[] arr = new int[list.size()];
        int idx = 0;
        for(int x : list){
            arr[idx] = x;
            idx++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        int[] arr;

        arr = intersect(nums1, nums2);

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
