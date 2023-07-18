class HeapSort {

    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;

        if(left < n && arr[largest] < arr[left]){
            largest = left;
        }

        if(right < n && arr[largest] < arr[right]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr){
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(arr, arr.length, i);
        }

        for(int i=arr.length-1 ; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i-1, 0);
        }

        
    }

    public static void main(String[] args) {
        int[] arr = {40, 77, 23, 99, 15, 71, 52, 47, 100};

        heapSort(arr);

        for(int x: arr){
            System.out.print(x+" ");
        }

    }
}