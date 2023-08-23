import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MaxProfitGolds {
    //  public static int maximizeTheProfit(int n, List<List<Integer>> offers) {
    //     HashMap<Integer,Boolean> map = new HashMap<>();
    //     int maxGold = 0;
    //     for(int i=0;i<n;i++){
    //         map.put(i,true);
    //     }
        
    //     PriorityQueue<Integer> golds = new PriorityQueue<>(Comparator.reverseOrder());
        
    //     for(int i=0;i<offers.size();i++){
    //         int val = offers.get(i).get(2);
    //         golds.add(val);
    //     }

    //     HashMap<Integer,Integer> finsihed = new HashMap<>();

    //     while(!golds.isEmpty()){
    //         int curr = golds.remove();
            
    //         for(int j=0;j<offers.size();j++){
    //             boolean isValid = true;
    //             if(finsihed.containsKey(j)){
    //                 continue;
    //             }
    //             if(curr == offers.get(j).get(2)){
    //                 List<Integer> array = offers.get(j);
    //                 finsihed.put(j, 1);
    //             for(int k=array.get(0);k<=array.get(1);k++){
    //             if(map.get(k) == false){
    //                 isValid = false;
    //                 break;
    //             }
    //             map.put(k,false);
    //         }

    //         if(isValid){
    //             maxGold = maxGold + array.get(2);
    //             break;
    //         }
                    
    //             }
    //         }
    //     }


        
    //     // for(int i=0;i<arr.length;i++){
    //     //     int index = golds.get(arr[i]);
    //     //     boolean isValid = true;
            
    //     //     List<Integer> array = offers.get(index);
            
    //     //     for(int j=array.get(0);j<=array.get(1);j++){
    //     //         if(map.get(j) == false){
    //     //             isValid = false;
    //     //             break;
    //     //         }
    //     //         map.put(j,false);
    //     //     }
            
    //     //     if(isValid){
    //     //         maxGold = maxGold + array.get(2);
    //     //     }
            
    //     // }
        
    //     return maxGold;
    // }

    // public static void main(String[] args) {
    //      List<List<Integer>> offers = new ArrayList<>();
        
    //     // Adding sublists to the main ArrayList
    //     offers.add(new ArrayList<Integer>() {{ add(0); add(0); add(1); }});
    //     offers.add(new ArrayList<Integer>() {{ add(0); add(2); add(2); }});
    //     offers.add(new ArrayList<Integer>() {{ add(1); add(3); add(2); }});
        
    //     System.out.println(maximizeTheProfit(5, offers));
    // }

    public static int maxGold(int n, int[][] offers) {
        int[] dp = new int[n]; // dp[i] stores the maximum gold earned up to house i
        
        Arrays.sort(offers, (a, b) -> a[1] - b[1]); // Sort offers based on end position
        
        for (int i = 0; i < n; i++) {
            dp[i] = offers[i][2]; // Initialize with the gold from the current offer
            
            for (int j = 0; j < i; j++) {
                if (offers[j][1] <= offers[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + offers[i][2]);
                }
            }
            
            if (i > 0) {
                dp[i] = Math.max(dp[i], dp[i - 1]); // Update with the maximum gold so far
            }
        }
        
        return dp[n - 1]; // Return the maximum gold earned at the last house
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] offers = {{0, 0, 1}, {0, 2, 2}, {1, 3, 2}};
        System.out.println(maxGold(n, offers)); // Output: 3
    }
}
