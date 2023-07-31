public class Max69num {

    public static int maximum69Number (int num) {
        int number = num;
        int length = 1; // By default, any non-negative integer has at least one digit
    
        while (number >= 10) {
            number /= 10;
            length++;
        }
        
        number = num;
    
        int[] arr = new int[length];
    
        for(int i=length-1;i>=0;i--){
            int last = number % 10;
            number = number / 10;
            arr[i] = last;
        }
    
        for(int i=0;i<length;i++){
            if(arr[i] == 6){
                arr[i] = 9;
                break;
            }
        }
    
        number = 0;
    
        for(int i=0;i<length;i++){
            number = number * 10 + arr[i]; 
        }
    
        return number;
    
    
        }

    public static void main(String[] args) {
        int number = maximum69Number(9669);

        System.out.println(number);
    }
}
