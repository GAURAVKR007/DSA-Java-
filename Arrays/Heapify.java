public class Heapify {

    public static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] = arr[idx1] + arr[idx2];
        arr[idx2] = arr[idx1] - arr[idx2];
        arr[idx1] = arr[idx1] - arr[idx2];

    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = i*2;
        int right = (i*2)+1;

        if(left < n && arr[largest] < arr[left]){
            largest = left;
        }

        if(right < n && arr[largest] < arr[right]){
            largest = right;
        }

        if(i!=largest){
            swap(arr,i,largest);
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,10,30,50,20,35,15};

        for(int i=arr.length/2; i>0 ; i--){
            heapify(arr, arr.length, i);
        }

        for(int x = 1; x< arr.length; x++){
            System.out.print(arr[x]+" ");
        }

    }
    
}
