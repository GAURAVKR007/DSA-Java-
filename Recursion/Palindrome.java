public class Palindrome {
    // public static boolean checkPalindrome(String str,int i){
        
    //     if(i >= str.length()/2){
    //         return true;
    //     }

    //     if(str.charAt(i) != str.charAt(str.length() - i - 1)){
    //         return false;
    //     }

    //     checkPalindrome(str, i+1);
    //     return true;
    // }
    // public static void main(String[] args) {
    //     String str = "Madam";
    //     str = str.toLowerCase();
    //     System.out.println(str);
    //     System.out.println(checkPalindrome(str,0)); 
    // }
 

    public static boolean checkPalindrome(String x,int i){
        boolean res = false;
        if(i >= x.length()/2){
             res = true;
            return res;
        }

        if(x.charAt(i) != x.charAt(x.length() - i - 1)){
            res = false;
            return res;
        }

        
        res = checkPalindrome(x,i+1);
        return res;
    }

    public static boolean isPalindrome(int x) {
        
        if(x<0 || (x!=0 && x%10==0)){
            return false;
        }

    String num = Integer.toString(x); 
    // int size = num.size();
    // boolean check = true;
    boolean res = checkPalindrome(num,0);
    return res;
}

public static void main(String[] args) {
    int x = 121;
    System.out.println( isPalindrome(x));
}
}
