public class DesecendingMergeSort {

public static void main(String[] args) {
    int[] array = {20,35,-15,7,55,1,-22};

    mergeSort(array,0,array.length -1);

    print(array);

   
}  

public static void mergeSort(int[] arr,int start,int end) {
    if(start>=end){
        return;
    }

    int mid = start +(end - start)/2;

    mergeSort(arr, start, mid);
    mergeSort(arr, mid+1, end);
    merge(arr,start,mid,end);

}

public static void merge(int[] arr,int start,int mid,int end) {
    int[]  temp = new int[end - start +1];
    int k =0 ;
    int i = start;
    int j= mid+1;

    while(i <= mid && j <= end){
        if(arr[i] >= arr[j]){
            temp[k++] = arr[i++];
        }else{
            temp[k++] = arr[j++];
        }
    }

    while(j<=end){
        temp[k++] = arr[j++];
    }

    while(i<=mid){
        temp[k++] = arr[i++];
    }

   

    

    for(i=0,j = start;i<temp.length;i++,j++){  // Copying the Sorted Array into my Original Array
        arr[j] = temp[i];
    }

    // for(int t = 0;t<temp.length;t++){
    //     arr[t] = temp[t];
    // }
}


public static void print(int[] arr) {
    System.out.print("Array is : ");
    for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] +" ");
    }
}
}