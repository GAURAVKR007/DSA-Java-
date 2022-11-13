public class QuickSortUdemy {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        quickSort(array, 0, array.length);

        print(array);

    }

    public static void quickSort(int[] arr,int start,int end) {
        
        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(arr,start,end);

        quickSort(arr, start, pivotIndex);        // Sort the Left Array After the pivot index
        quickSort(arr, pivotIndex + 1, end);      // Sort the right Array After the pivot index

    }

    public static int partition(int[] arr,int start,int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;

        while(i<j) {

            while(i<j && arr[--j]>=pivot);  //  Its just Iterating j to the value lesser than pivot
            if(i<j) {
                arr[i] = arr[j];
            }

            while(i < j && arr[++i]<=pivot);  //  Its just Iterating i to the value Greator than pivot
            if(i<j) {
                arr[j] = arr[i];
            }
        }

        arr[j] = pivot;
        return j;
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}
}
