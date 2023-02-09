import java.util.HashMap;

class MAjority_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int N = nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key) != null){
                if(map.get(key) > N){
                System.out.println(key);
            }
            }
            
        }

        System.out.println(-1);
    }
}