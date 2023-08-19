public class MinimumOfTwoArray {
    public static String minimum(int[] arr){
        int min = Integer.MAX_VALUE;

        for(int x : arr){
            if(min > x){
                min = x;
            }
        }

        Integer mini = new Integer(min);

        String ans = mini.toString();

        return ans;
    }

    public static String minimum2(int[] arr , String s){
        int min = Integer.MAX_VALUE;

        int prev = Integer.parseInt(s);

        for(int x : arr){

            if(prev == x){
                return "";
            }

            if(min > x){
                min = x;
            }
        }

        Integer mini = new Integer(min);

        String ans = mini.toString();

        return ans;
    }

    public static int minNumber(int[] nums1, int[] nums2) {
        String res = "";

        String min1 = minimum(nums1);
        String min2 = minimum2(nums2,min1);

        if(min1.equals(min2)){
            return Integer.parseInt(min1);
        }

        res = min1 + min2;

        return Integer.parseInt(res);

    }
    public static void main(String[] args) {
        
        int[] arr1 = {3,5,2,6};
        int[] arr2 = {3,1,7};

        System.out.println(minNumber(arr1, arr2));
    }
}
