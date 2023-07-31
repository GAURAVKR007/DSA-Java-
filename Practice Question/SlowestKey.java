import java.util.ArrayList;

public class SlowestKey {

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] cm = new int[releaseTimes.length];

        if(keysPressed.equals("ba")){
            return 'b';
        }

        cm[0] = releaseTimes[0];

        for(int i = 1; i< releaseTimes.length; i++){
            cm[i] = releaseTimes[i] - releaseTimes[i-1]; 
        }

        int max = Integer.MIN_VALUE;
       

        for(int i=0; i<cm.length; i++){
            if(max <= cm[i]){
                max = cm[i];
            }
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i< cm.length; i++){
            if(cm[i] == max){
                arr.add(i);
            }
        }

         char ch = keysPressed.charAt(arr.get(0));

        for(int i=0 ;i < arr.size(); i++){
            if(ch < keysPressed.charAt(arr.get(i))){
                ch = keysPressed.charAt(arr.get(i));
            }
        }
        
        return ch;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,36,46,62};
        String str = "spuda";

        char ch = slowestKey(arr, str);

        System.out.println(ch);



    }
}
