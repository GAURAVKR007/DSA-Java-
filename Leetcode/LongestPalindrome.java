public class LongestPalindrome {
    // public static String isPalindrome(String str,int index){
        
        
    // }
    public static String longestPalindrome(String s) {

        if(s.length() < 2){
            return s;
        }

        String res = "";
        
        for(int i=0;i<s.length()-1;i++){
            // String curr = isPalindrome(s,i);

            // if(curr.length() > res.length()){
            //     res = curr;
            // }
        }
    
        return res;
}

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
}
