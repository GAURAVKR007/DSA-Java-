public class QuickSort {

    public static void main(String[] args) {
        
        int[] arr = {20,-13,11,15,-2,14};
        int len = arr.length;

        quickSort(arr,0,len - 1);
        print(arr);
    }

    public static void quickSort(int[] arr,int low, int high) {
        int partitionIndex;

        if(low < high) {
            partitionIndex = partition(arr,low,high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr,int low ,int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            while(arr[i] <= pivot && i < j) {
                i++;
            }

            while(arr[j] > pivot) {
                j--;
            }

            if(i<j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }

        }while(i < j);

            temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;

            return j;
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}
}