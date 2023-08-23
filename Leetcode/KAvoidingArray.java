import java.util.HashMap;

public class KAvoidingArray {
     public static int minimumSum(int n, int k) {
        int num = n;
        int start = 1;
        int sum = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        while(num > 0){
            if(map.containsKey(start)){
                start++;
                continue;
            }
            
            sum = sum + start;
            
            int val = k - start;
            map.put(val,1);
            start++;
            num--;
        }
        
        return sum;
    }   

    public static void main(String[] args) {
        System.out.println(minimumSum(5, 4));
    }
}
