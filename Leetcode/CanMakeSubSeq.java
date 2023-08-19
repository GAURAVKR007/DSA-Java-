public class CanMakeSubSeq {
    public static boolean canMakeSubsequence(String str1, String str2) {
        if (str1.equals(str2)) {
       return true; // No need to perform an operation if strings are already equal
   }
   
   int i = 0; // Pointer for str1
   int j = 0; // Pointer for str2
   int operations = 0; // Counter for the number of operations used
   
   while (i < str1.length() && j < str2.length()) {
       if (str1.charAt(i) == str2.charAt(j)) {
           i++;
           j++;
       } else {

        char c = str1.charAt(i);
        int intValue = c - 'a';
        intValue = (intValue + 1) % 26;
        char updatedChar = (char) (intValue + 'a');

        if(updatedChar == str2.charAt(j)){
            i++;
            j++;
            continue;
        }

        //  c = str1.charAt(i);
        // int intValue2 = c - 'a';
        //  intValue2 = (intValue2  - 1) % 26;
        //  updatedChar = (char) (intValue2 + 'a');

        // if(updatedChar == str2.charAt(j)){
        //     i++;
        //     j++;
        //     continue;
        // }
           i++;
       }
       
   }
   
   // If we've reached the end of str2 using at most one operation, return true
   return j == str2.length();
   }

   public static void main(String[] args) {
    System.out.println(canMakeSubsequence("c", "b"));
   }
}
