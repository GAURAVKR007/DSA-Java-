import java.util.ArrayList;

class MinimumMarked {
    public static long findScore(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int x : nums) {
            arr.add(x);
        }
        long count = 0;
        while (arr.size() > 1) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) <= min) {
                    min = arr.get(i);
                    idx = i;
                }
            }
            // int currScore = arr.get(idx);
            if (idx > 0) {
                // currScore += arr.get(idx - 1);
                arr.remove(idx - 1);
                idx--;
            }
            if (idx < arr.size() - 1) {
                // currScore += arr.get(idx + 1);
                arr.remove(idx + 1);
            }
            
            count = count + arr.get(idx);
            
            arr.remove(idx);
            // count += currScore;
        }
        if (arr.size() == 1) {
            count += arr.get(0);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        long num = findScore(nums);
       System.out.println(num);
    }
}




