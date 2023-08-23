import java.util.Stack;

public class ReverseStringParenthessis {
    // public static String reverse(String str){
    //     char[] ch = str.toCharArray();
    //     for(int i=0; i<ch.length/2; i++){
    //         char temp = ch[i];
    //         ch[i] = ch[ch.length - i - 1];
    //         ch[ch.length - i - 1] = temp;
    //     }

    //     String res = new String(ch);

    //     return res;
    // }
    // public static String reverseParentheses(String s) {
    //     Stack<Integer> stack = new Stack<>();

    //     char[] ch = s.toCharArray();

    //     String res = s;

    //     int lastOpen = 0;
    //     int lastClose = 0;

    //     for(int i=0;i<ch.length; i++){

    //         if(ch[i] == ')'){
    //             int currOpen = stack.pop();
    //             String curr = res.substring(currOpen+1,i);
    //                 res = res.substring(0 ,currOpen) + reverse(curr) + res.substring(i+1,ch.length);
    //                 ch =res.toCharArray();
    //                 i = i-2;
    //                 continue;
    //         }


    //         if(ch[i] == '('){
    //             stack.add(i);
    //         }
    //     }

    //     if(ch.length != res.length()){

    //     String pre = s.substring(0,lastOpen);
        
    //     for(int i=s.length() -1; i>=0; i--){
    //         if(s.charAt(i) == ')'){
    //             lastClose = i;
    //             break;
    //         }
    //     }

    //     String post = s.substring(lastClose+1, s.length());

    //     res = pre +  res+ post;

    //     }


    //     return res;

    // }

    public static String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String str = "";
   
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                str += s.charAt(i);
            }else if(s.charAt(i) == '('){
                stack.push(str);
                str = "";
            }else{
                String p = stack.pop();
                String r = new StringBuilder(str).reverse().toString();
                str = p+r;
            }
        }
   
        return str;
       }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("(u(love)i)"));
    }
}
