import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public static void main(String[] args) {
          // Create a HashMap
          String s = "aab";
          char[] ch = s.toCharArray();

          HashMap<String,Integer> hashMap = new HashMap<>();
    
          for(char c : ch){
              if(hashMap.containsKey(Character.toString(c))){
                  hashMap.put(Character.toString(c),hashMap.get(Character.toString(c))+1);
              }else{
                  hashMap.put(Character.toString(c),1);
              }
          }


        // Create a priority queue of Map.Entry objects using a custom comparator
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
            (entry1, entry2) -> entry2.getValue() - entry1.getValue() 
        );

        // Add all entries from the HashMap to the priority queue
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            priorityQueue.offer(entry);
        }
        
        String str = "";

        Map.Entry<String, Integer> block = priorityQueue.poll();

        str = str+ block.getKey();

        block.setValue(block.getValue() -1);

        // Poll entries from the priority queue in order of priority
        while (!priorityQueue.isEmpty()) {
            Map.Entry<String, Integer> temp = priorityQueue.poll();

            str = str + temp.getKey();
            temp.setValue(temp.getValue() -1);

            if(block.getValue() > 0){
                priorityQueue.offer(block);
            }

            block = temp;
        }

        if(block.getValue()>0){
            System.out.println("Nothing");
        }else{
            System.out.println(str);
        }


    }
}
