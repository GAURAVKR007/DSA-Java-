public class CheckCharacterOccurance {

    public static int occurance(String str , char ch){
        int count = 0;
        for(char c : str.toCharArray()){
            if(c == ch){
                count++;
            }
        }

        return count;
    }
   public static void main(String[] args) {
        String str = "Hello world";

        char ch = 'o';

        System.out.println(occurance(str, ch));
   } 
}
