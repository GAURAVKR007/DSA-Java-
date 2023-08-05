public class FirstOccurance {

    public static int strStr(String haystack, String needle) {
        int count = needle.length();
        int k = 0;
        for(int i=0; i<haystack.length();i++){
            for(int j=i;j<needle.length()+i;j++){
                if(needle.length() + i > haystack.length()){
                    return -1;
                }
                if(haystack.charAt(j) == needle.charAt(k)){
                    count--;
                    k++;

                    if(count == 0){
                        return i;
                    }
                }
            }

            k=0;
            count = needle.length();
        }

        return -1;

    }

    public static void main(String[] args) {
        int res = strStr("leetcode", "leeto");

        System.out.println(res);
    }
}
