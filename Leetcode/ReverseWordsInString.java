public class ReverseWordsInString {

    public static String reverse(char[] ch){
        for(int i=0;i<(ch.length -1 ) /2; i++){
            char temp = ch[i];
            ch[i] = ch[ch.length - i - 2];
            ch[ch.length - i - 2] = temp;
        }

        String res = new String(ch);
        return res;
    }
    public static String reverseWords(String s) {
        int lastWord = 0;
        String res = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                String temp = s.substring(lastWord,i+1);
                char[] ch = temp.toCharArray();
                res = res + reverse(ch);
                lastWord = i+1;
            }
        }

        String temp = s.substring(lastWord,s.length());
        char[] ch = temp.toCharArray();

        if(lastWord != s.length()){
            
            for(int i=0;i<ch.length/2; i++){
            char temp1 = ch[i];
            ch[i] = ch[ch.length - i - 1];
            ch[ch.length - i - 1] = temp1;
        }       
        }

        String res1 = new String(ch);
        res = res + res1;

        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
