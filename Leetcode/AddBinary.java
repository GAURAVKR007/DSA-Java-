public class AddBinary {
    public static String paddingZero(String str1,String str2){
        int maxLength = str1.length()>str2.length() ? str1.length() : str2.length();
        char[] ch = new char[maxLength];

        if(maxLength != str1.length()){
            int idx = ch.length -1;
            int index = str1.length() -1;
            while(index >= 0){
                ch[idx--] = str1.charAt(index--);
            }

            while(idx >=0){
                ch[idx--] = '0';
            }
        }

        if(maxLength != str2.length()){
            int idx = ch.length -1;
           int index = str2.length() -1;
            while(index >= 0){
                ch[idx--] = str2.charAt(index--);
            }

            while(idx >=0){
                ch[idx--] = '0';
            }
        }

        String res = new String(ch);

        return res;
    }
    public static String addBinary(String a, String b) {
        if(a.length() == b.length()){

        } else if(a.length() < b.length()){
            a = paddingZero(a,b);
        } else{
            b = paddingZero(a,b);
        }

        String res = "";
        int carry = 0;
        for(int i=a.length() -1;i>=0;i--){
            int num1 = Character.getNumericValue(a.charAt(i));
            int num2 = Character.getNumericValue(b.charAt(i));

            if(num1 + num2 + carry == 0){
                res = "0" + res;
            }else if(num1 + num2 + carry == 1){
                res = "1" + res;
                if(carry == 1){
                    carry = 0;
                }
            }else if(num1 + num2 + carry == 2){
                res = "0" + res;
                carry = 1;
            }else if(num1 + num2 + carry == 3){
                res = "1" +res;
                carry =1;
            }
        }

        if(carry == 1){
            res = "1" + res;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}
