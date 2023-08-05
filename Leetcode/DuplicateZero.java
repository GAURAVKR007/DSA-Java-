public class DuplicateZero {

    public static void shift(int[] arr , int start){

        for(int i = arr.length -1 ; i>=start; i--){
            arr[i] = arr[i-1];
        }
    }

    public static void duplicateZeros(int[] arr) {
        
        int x = 0;

        while(x < arr.length){
            if(arr[x] == 0){
                shift(arr,x+1);
                arr[x++] = 0;
                if(x >= arr.length)
                {
                break;
                }
                arr[x++] = 0;

                continue;
            }

            if(x >= arr.length){
                break;
            }
            

            x++;
        }

    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};

        duplicateZeros(arr);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
