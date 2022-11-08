public class MergeSort {
    public static void main(String[] args) {

        // Time Complexity -> O(nlogn)
        
        int[] array = {20,35,-15,7,55,1,-22};

        int start = 0;
        int end = array.length;

        mergeSort(array,start,end-1);
        print(array);
    }

    public static void mergeSort(int[] arr,int start,int end) { 
        if(start>=end){
            return;
        }
        int mid = start + (end-start)/2;

        mergeSort(arr, start, mid);   // Sorting the Left Array
        mergeSort(arr, mid+1, end);   // Sorting the Right Array
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr,int start,int mid,int end) {
       

        int[] tempArr = new int[end - start + 1];
        int k =0;

        int i = start;
        int j = mid+1;

        while(i<=mid && j<=end){
            if(arr[i] <= arr[j]){
                tempArr[k++] = arr[i++];
            }else{
                tempArr[k++] = arr[j++];
            }
        }

        while(i<=mid){
            tempArr[k++] = arr[i++];
        }

        while(j<=end){
            tempArr[k++] = arr[j++];
        }

        for(i=0,j = start;i<tempArr.length;i++,j++){  // Copying the Sorted Array into my Original Array
            arr[j] = tempArr[i];
        }

        
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}

}