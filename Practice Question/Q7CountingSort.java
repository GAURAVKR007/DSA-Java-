public class Q7CountingSort {
    public static void main(String[] args) {
        
        int[] array = {7,4,2,8,5,6,3,9,12,1,15,55,23,43,87,42,33};

        countingSort(array);

        print(array);
    }

    public static void countingSort(int[] arr) {
        
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int[] countArr = new int[max+1];

        // Total count of each Unique Element

        for(int i=0;i<arr.length;i++){
            countArr[arr[i]] += 1;
        }

        for(int i=0,j=0;i<max+1;i++){
            while(countArr[i] > 0){
                arr[j++] = i;
                countArr[i] -= 1;
            }
        }
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
