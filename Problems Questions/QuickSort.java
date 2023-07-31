class QuickSort {

    public static int partition(int[] arr, int start, int end){
        int i = start - 1;

        int pivot = arr[end];

        for(int j = start; j < end; j++){

            if(arr[j] < pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int pivot = partition(arr, start , end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        quickSort(arr,0, arr.length-1);

        System.out.print("Sorted Array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}