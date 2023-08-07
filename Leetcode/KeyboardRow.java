import java.util.ArrayList;
import java.util.HashMap;

public class KeyboardRow {


     public static boolean compare(String s1,String s2){

        s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : c1){
            map.put(c,1);
        }

        for(char c : c2){
            if(map.containsKey(c) == false){
                return false;
            }
        }

        return true;

    }

    public static String[] findWords(String[] words) {
        String[] str = {"qwertyuiop" , "asdfghjkl", "zxcvbnm"};
        ArrayList<String> res = new ArrayList<>();

        for(int i=0; i<words.length; i++){

            String tempStr = String.valueOf(words[i].charAt(0)).toLowerCase();

            if(str[0].contains(tempStr)){
              boolean isValid = compare(str[0],words[i]);

              if(isValid){
                  res.add(words[i]);
              }
              continue;
            }

            if(str[1].contains(tempStr)){
                boolean isValid = compare(str[1],words[i]);

              if(isValid){
                  res.add(words[i]);
              }
              continue;
            }

            if(str[2].contains(tempStr)){
                boolean isValid = compare(str[2],words[i]);

              if(isValid){
                  res.add(words[i]);
              }
              continue;
            }
        }

        String[] answer = new String[res.size()];
        int idx = 0;
        for(String s : res){
            answer[idx++] = s;
        }

        return answer;

    }


    public static void main(String[] args) {
        String[] str = {"Hello","Alaska","Dad","Peace"};
        String[] res = findWords(str);

        for(String s : res){
            System.out.println(s+" ");
        }
    }
}
