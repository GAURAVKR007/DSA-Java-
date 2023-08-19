import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        
        HashMap<String,Integer> map = new HashMap<>();
        String newPara = paragraph.replace(",", " ");
        String newPara1 = newPara.replace("!", " ");
        String newPara2 = newPara1.replace("?", " ");
        String newPara3 = newPara2.replace("'", " ");
        String newPar4 = newPara3.replace(";", " ");
        String finalPara = newPar4.replace(".", " ");

        finalPara = finalPara.toLowerCase();
        String[] para = finalPara.split("\\s+");

        for(String s : para){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }

        for(String str : banned){
            if(map.containsKey(str)){
                map.put(str,-1);
            }
        }

        int maxValue = 0;
        String answer = "";
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue() > maxValue){
                maxValue = e.getValue();
                answer = e.getKey();
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        
    }
}
