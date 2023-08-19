public class ReverseString2 {
    public static void reverse(char[] ch , int start, int end){
        int idx = 0;
        for(int i=start;i<=(end+start)/2; i++){
            char temp = ch[i];
            ch[i] = ch[end - idx];
            ch[end - idx] = temp;
            idx++;
        }
    }
    public static String reverseStr(String s, int k) {

        
        char[] ch = s.toCharArray();
        if( k >= s.length()){
         reverse(ch, 0, ch.length -1 );  
         String res = new String(ch);

        return res; 
        }
        int check = k;
        for(int i=0;i<ch.length; i++){
            if(check == 1){
                check = k+k;
                reverse(ch,i-k+1,i);
                continue;
            }
            check--;
        }

        String res = new String(ch);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl", 39));
    }
}
