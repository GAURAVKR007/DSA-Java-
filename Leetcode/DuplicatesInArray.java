import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {

    public static List<Integer> findDuplicates(int[] nums) {
    // Create a new ArrayList to store the duplicate elements
    final List<Integer> duplicates = new ArrayList<Integer>();

    // Iterate through the input array
    for (int i = 0; i < nums.length; i++) {
        // Get the absolute value of the current element
        final int n = Math.abs(nums[i]);

        // Check if the element at index (n - 1) is already marked as negative
        if (nums[n - 1] < 0) {
            // If it's negative, it means we have seen this element before,
            // so it's a duplicate. Add it to the 'duplicates' list.
            duplicates.add(n);
        } else {
            // If it's positive, it means it's the first time we encounter this element.
            // Mark it as negative to indicate that we have seen it.
            nums[n - 1] *= -1;
        }
    }

    // Return the list of duplicate elements
    return duplicates;
}
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> nums = findDuplicates(arr);

        for(int x: nums){
            System.out.print(x+" ");
        }
    }
}
