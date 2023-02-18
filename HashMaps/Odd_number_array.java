import java.util.*;
// import java.util.Map.*;
public class Odd_number_array {
    public static void main(String[] args) {
        int[] arr = {5,5,5,9,8,7,7,9,7,8,8,7,0,6,5,6};

        Arrays.sort(arr);
        int value = arr[0];
        int count = 0;

        for(int x : arr){
            if(value == x){
                count++;
            }
            if(value != x){
                if(count%2!=0){
                    System.out.println(value);
                }
                value = x; 
                count = 1;
            }
        }

        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i = 0;i<arr.length;i++){
        //     if(map.containsKey(arr[i])==true) {
        //     map.put(arr[i], map.get(arr[i])+1);
        //     }else{
        //         map.put(arr[i], 1);
        //     }
        // }

        
        // for(Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue()%2!=0){
        //         System.out.print(entry.getKey()+ " ");
        //     }
        // }   

        

    }
}
