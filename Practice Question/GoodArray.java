import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class GoodArray{

    

    public static boolean isGood(int[] nums){
        Arrays.sort(nums);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x: nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x) + 1);
            }else{
                map.put(x,1);
            }
        }

        int max = nums[nums.length - 1];

        if(map.get(max) > 2 || map.get(max) < 2){
            return false;
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1 && entry.getKey() != max){
                return false;
            }   
        }

        int count = max - 1;

        for(int i = nums.length - 3; i >=0 ; i--){
            if(count  == nums[i]){
                count--;
            }else{
                return false;
            }
        }

        if(count != 0){
            return false;
        }

        return true;
        
    }


    public static int sumOfSquares(int[] nums) {
        int n = nums.length;

        int sumOfSquares = 0;

        for(int x: nums){
            if(n%x == 0){
                sumOfSquares += x*x;
            }
        }

        return sumOfSquares;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,1,19,18,3};

        int sum = sumOfSquares(arr);
        System.out.println(sum);

        // boolean good = isGood(arr);

        // System.out.println("Array is : "+good);
    }
}