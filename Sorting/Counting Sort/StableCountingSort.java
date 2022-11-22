// import java.lang.reflect.Array;
import java.util.Arrays;

public class StableCountingSort {
    public static void main(String[] args) {
        
        int[] array = {7,4,2,8,5,6,3,9,12,1,15,55,23,43,87,42,33};

        countingSort(array);

    }

    public static void countingSort(int[] arr) {
        
        // int max = 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int range = max - min + 1;

        int[] countArr = new int[range];
        int[] output = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            countArr[arr[i] - min] += 1; 
        }

        // To find the Cummulatative sum
       for(int i = 1;i<countArr.length;i++){
        countArr[i] += countArr[i-1];
       }

       // Building the output array

       for(int i= arr.length - 1;i>=0;i--){
            output[countArr[arr[i] - min] - 1] = arr[i];
            countArr[arr[i] - min] -= 1;
       }

       print(output);

    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
