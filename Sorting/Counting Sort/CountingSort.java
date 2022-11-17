public class CountingSort {

    public static void main(String[] args) {
        int[]  array = {2,5,9,8,2,80,7,10,40,3};
        countingSort(array, 1, 100);
        print(array);
    }

    public static void countingSort(int[] arr,int min,int max) {
        int[] countArray = new int[(max - min ) + 1];

        for(int i = 0;i<arr.length;i++){
            countArray[arr[i] - min]++;
        }

        int j = 0;
        for(int i = min;i<=max;i++){
            while(countArray[i-min] > 0) {
               arr[j++]  = i;
               countArray[i - min]--;
            }
        }
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}
}