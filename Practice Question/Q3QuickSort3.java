public class Q3QuickSort3 {

    public static void main(String[] args) {
        
        int[] array = {21,-44,76,23,07,99,-56,12};
        quickSort(array,0,array.length);
        print(array);
    }

    public static void quickSort(int[] arr,int start,int end) {
        if(end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr,start,end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);
    }

    public static int  partition(int[] arr,int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i<j){
            while(i<j && arr[--j]>=pivot);
            if(i<j){
                arr[i] = arr[j];
            }

            while(i<j && arr[++i]<=pivot);
            if(i<j){
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}