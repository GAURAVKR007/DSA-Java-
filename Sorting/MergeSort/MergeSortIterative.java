public class MergeSortIterative {

    public static void main(String[] args) {
          // Time Complexity -> O(nlogn)
        
          int[] array = {11,13,7,12,16,9,24,5,10,3};
          int end = array.length;
  
          iMergeSort(array,end-1);
          print(array);
    }

    public static void iMergeSort(int[] arr,int n) {
        
        int p,i,l,mid,h;

        for(p=2;p<=n;p=p*2) {
            for(i=0;i+p-1<n+1;i=i+p) {
                l = i;
                h = i+p-1;
                mid = (l+h)/2;
                merge(arr, l, mid, h);
            }
        }
        if(p/2 < n){
            merge(arr,0,p/2-1, n);
        }
    }

    public static void merge(int[] arr,int start,int mid,int end) {
       

        int[] tempArr = new int[arr.length];
        int k = start;

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

        // for(i=0,j = start;i<tempArr.length;i++,j++){  // Copying the Sorted Array into my Original Array
        //     arr[j] = tempArr[i];
        // }

        for(int t=start;t<=end;t++){
            arr[t] = tempArr[t];
  }

        
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}
}