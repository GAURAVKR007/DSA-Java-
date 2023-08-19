import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MostProfit {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int totalProfit = 0;

        TreeMap<Integer, Integer> jobMap = new TreeMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            jobMap.put(difficulty[i], Math.max(jobMap.getOrDefault(difficulty[i], 0), profit[i]));
        }
    
        int maxProfit = 0;
        int res = 0;
        int max = 0;
    
        for(Integer key: jobMap.keySet()){
            max = Math.max(jobMap.get(key),max);
            jobMap.put(key,max);
        }
    
        for (int w : worker) {
            Integer bestDifficulty = jobMap.floorKey(w); // Find the best job difficulty
            if (bestDifficulty != null) {
                maxProfit = jobMap.get(bestDifficulty);
            }
            if(bestDifficulty != null) {
                totalProfit += maxProfit;
            }
        }
    
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] difficulty ={68,35,52,47,86};
        int[] profit ={67,17,1,81,3};
        int[] worker ={92,10,85,84,82};
        
        System.out.println(maxProfitAssignment(difficulty, profit, worker));
    }
}
