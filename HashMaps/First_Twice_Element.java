import java.util.HashMap;

class Solution5 {
    public char repeatedCharacter(String s) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(Character.toString(s.charAt(i)))){
                map.put(Character.toString(s.charAt(i)),map.get(Character.toString(s.charAt(i)))+1);
            }else{
                map.put(Character.toString(s.charAt(i)),1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.containsKey(Character.toString(s.charAt(i)))){
                if(map.get(Character.toString(s.charAt(i)))>1){
                    return s.charAt(i);
                }
            }
        }

        return 'n';
    }
}


public class First_Twice_Element {
    public static void main(String[] args) {
        String s = "abccbaacz";

        Solution5 sol5 = new Solution5();
        System.out.println(sol5.repeatedCharacter(s));
    }
}
