public class Q2MergeSort2 {
    public static void main(String[] args) {
        
        int[] array = {20,7,23,-87,65,32,77,45};
        quickSort(array,0,array.length - 1);
        print(array);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }

        int mid = start + (end - start)/2;
        quickSort(arr, start, mid);
        quickSort(arr, mid + 1, end);
        merge(arr,start,mid,end);
    }


    public static void merge(int[] arr,int start,int mid,int end) {
        
        int[] temp = new int[end - start + 1];
        int k = 0;
        
        int idx1 = start;
        int idx2 = mid + 1;

        while(idx1 <= mid && idx2 <= end){
            if(arr[idx1] <= arr[idx2]){
                temp[k++] = arr[idx1++];
            }else{
                 temp[k++] = arr[idx2++];
            }
        }

        while(idx1 <= mid) {
            temp[k++] = arr[idx1++];
        }
        
        while(idx2 <= end){
            temp[k++] = arr[idx2++];
        }

        for(int i = 0,j= start;i<temp.length;i++,j++){
            arr[j] = temp[i];
        }

    }


    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
