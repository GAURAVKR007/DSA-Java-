import java.util.ArrayList;
public class UglyNumber {
    public static int thUglyNumber(int n) {
       
        ArrayList<Integer> list = new ArrayList<>();

        int number = n;
        int start = 0;
        while(number > 0){
            int num = start;
            boolean isUgly = false;
            while(num >= 1){

                if(num == 1){
                    isUgly = true;
                    break;
                }

                if(num %2 == 0){
                    num = num /2;
                    continue;
                }else if(num %3 == 0){
                    num = num /3;
                    continue;
                }else if(num %5 == 0){
                    num = num /5;
                    continue;
                }else {
                    isUgly = false;
                    break;
                }
            }

            if(isUgly){
                list.add(start);
                number--;
                start++;
                continue;
            }

            start++;
        }

       return list.get(list.size() -1);
        
    }

    public static void main(String[] args) {
        System.out.println(thUglyNumber(1352));
    }
}
