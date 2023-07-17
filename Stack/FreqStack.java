import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
// import java.util.Map.Entry;

class FrequencyStack {
    List<Integer> stack;
    HashMap<Integer,Integer> map = new HashMap<>();

    public FrequencyStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);

        if(map.containsKey(val)){
            map.put(val,map.get(val)+1);
        }else{
            map.put(val,1);
        }
    }
    
    public int pop() {
        if(stack.size() <= 0){
            return -1;
        }

        Integer maxKey = null;
        Integer maxValue = Integer.MIN_VALUE;

        for(int i =0 ; i<stack.size();i++){
            if(map.get(stack.get(i)) >=maxValue){
                maxKey = stack.get(i);
                maxValue = map.get(stack.get(i));
            }
        }

        map.put(maxKey,map.get(maxKey) -1);

        // if(maxValue == 1){
        //     stack.
            
        // }

        for(int i=stack.size() -1;i>=0;i--){
            if(maxKey == stack.get(i)){
                stack.remove(i);
                break;
            }
        }

        return maxKey;

    }

    public void traverse(){
        System.out.println(stack);
    }
}

class FreqStack {
    public static void main(String[] args) {
        
        FrequencyStack f1 = new FrequencyStack();

        f1.push(5);
        f1.push(7);
        f1.push(5);
        f1.push(7);
        f1.push(4);
        f1.push(5);

       System.out.println(f1.pop()); 
       System.out.println(f1.pop()); 
       System.out.println(f1.pop()); 
       System.out.println(f1.pop()); 

        f1.traverse();
    

        
    }
}