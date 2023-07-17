public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();
        
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        
        boolean isAnagram = true;
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        if(str1.equals(str2)){
            return true;
        }
        
        for(int i=0;i<str1.length();i++){
            for(int j=0; j<str2.length();j++){
                if(chArr1[i] == chArr2[j]){
                    chArr1[i] = '#';
                    chArr2[j] = '#';
                    continue;
                }
            }
        }
        
        int idx = 0;
        
        while(idx < chArr1.length && idx < chArr2.length){
            if(chArr1[idx] != '#' || chArr2[idx] != '#'){
                return false;
            }
            idx++;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "lloHe";

        boolean isAnagramString = isAnagram(s1, s2);

        if(isAnagramString){
            System.out.println("Yes Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
