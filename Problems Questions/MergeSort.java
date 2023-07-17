public class MergeSort {

    public static void merge(int[] arr, int start, int mid, int end){
        int[] newArr = new int[arr.length];
        int k = 0;

        for(int x : arr) {
            newArr[k++] = x;
        }
        
        int idx1 = start;
        int idx2 = mid + 1;

        int count = start;
        while(idx1 <= mid && idx2 <= end){
            if(newArr[idx1] <= newArr[idx2]){
                arr[count++] = newArr[idx1++];
            }else{
                arr[count++] = newArr[idx2++];
            }
        }

        while(idx1 <= mid) {
            arr[count++] = newArr[idx1++];
        }

        while(idx2 <= end){
             arr[count++] = newArr[idx2++];
        }


    }

    public static void mergeSort(int[] arr, int start, int end){

        if(start>=end){
            return;
        }

        int mid = (end + start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);

    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        mergeSort(arr, 0 , arr.length-1);

        System.out.print("Sorted Array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
