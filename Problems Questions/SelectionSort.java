public class SelectionSort {

    public static void swap(int[] arr, int i, int location){

        arr[i] = arr[location] + arr[i];
        arr[location] = arr[i] - arr[location];
        arr[i] = arr[i] - arr[location];
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        

        for(int i = 0; i < n-1; i++){
            int min = arr[i];
            int location = i;
            boolean isSwap = false;

            for(int j = i+1; j<n; j++){
                if(min > arr[j]){
                    min = arr[j];
                    location = j;
                    isSwap = true;
                }
            }

            if(isSwap){
            swap(arr, i, location);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        selectionSort(arr);

        System.out.print("Sorted Array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

    }   
}
