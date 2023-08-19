import java.util.ArrayList;

public class AdjDupInString {

    public static String removeDuplicates(String s) {
        boolean isCan = true;

        ArrayList<Character> list = new ArrayList<>();

        for(char ch : s.toCharArray()){
            list.add(ch);
        }

        while(list.size() > 1 && isCan == true){
            for(int i=0; i<list.size() - 1;i++){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i);
                    list.remove(i);
                    isCan = false;
                    break;
                }
            }

            if(isCan == false){
                    isCan = true;
                }else{
                    isCan = false;
            }
        }

        char[] charArray = new char[list.size()];
        for (int i = 0; i < list.size(); i++) {
            charArray[i] = list.get(i);
        }

        String res = new String(charArray);

        return res;
    }

    public static void main(String[] args) {
        String str = "abbaca";

        String output = removeDuplicates(str);

        System.out.println(output);
    }
}
