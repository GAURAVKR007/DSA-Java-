public class RepeatedStringPatten {
    // public static boolean repeatedSubstringPattern(String s) {
    //     int n = s.length();
    //     int times = 1;
    //     for(int i=n/2;i>0;i--){

            

    //         if(n%i==0){
    //             times = n/i;
    //         String curr = s.substring(0,i);
    //         String exam = curr;

        
    //         for(int k=1;k<=times-1;k++){
    //             exam = exam+curr;
    //         }

    //     if(exam.equals(s)){
    //         return true;
    //     }
        
    //     }

    //     }

    //     return false;
    // }

    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;

        int length = str.length();

        int idx1 = 0;
        int idx2 = length -1;

        while(idx1 <= idx2){
            String exam = str.substring(idx1,idx2+1);

            if(exam.equals(s)){
                return true;
            }

            idx1++;
            idx2--;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababab"));
    }
}
