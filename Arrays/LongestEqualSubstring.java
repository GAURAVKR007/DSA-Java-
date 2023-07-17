public class LongestEqualSubstring {

    public static int findTheLongestBalancedSubstring(String s) {
        
        char[] ch = s.toCharArray();
        int count = 0;
        int zero = 1;
        int currCount = 0;
        
        
        for(int i=0;i<ch.length;i++){
            
            if(ch[i] == '1'){
                continue;
            }
            for(int j=i+1;j<ch.length;j++){
                
                char prev = ch[j-1];
                
                if(prev=='0'){
                    if(ch[j] == '0'){
                        zero++;
                    }else {
                        if(zero > 0){
                            currCount++;
                            zero--;
                        }
                    }
                }
                
                if(prev == '1'){
                    if(ch[j] == '1'){
                        if(zero > 0){
                            currCount++;
                            zero--;
                        }
                        
                    }else if(ch[j] == '0'){
                        break;
                    }
                    }
                }
            
            if(currCount > count){
                count = currCount;
            }
            currCount = 0;
            zero = 1;
            }
        return count * 2;
        
        }

    public static void main(String[] args) {
        String str = "00101";
    
   
    int ans = findTheLongestBalancedSubstring(str);
    System.out.println(ans);
    }
    
}
