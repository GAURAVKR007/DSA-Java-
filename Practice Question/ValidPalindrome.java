import java.util.ArrayList;

class ValidPalindrome {

    public static boolean isPalindrome(String s) {
         s = s.toLowerCase();

        ArrayList<Character> ch = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                ch.add(s.charAt(i));
            }
        }

        // Convert ArrayList<Character> to char[]
        char[] charArray = new char[ch.size()];
        for (int i = 0; i < ch.size(); i++) {
            charArray[i] = ch.get(i);
        }

        // Create the string using the char array
        String newStr = new String(charArray);

        int n = newStr.length();

        for(int i=0; i < n/2 ; i++){
            if(newStr.charAt(i) != newStr.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}