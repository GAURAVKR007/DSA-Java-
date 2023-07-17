public class BubbleSort {

    public static void swap(int[] arr, int x, int y){
        arr[x] = arr[x] + arr[y];
        arr[y] = arr[x] - arr[y];
        arr[x] = arr[x] - arr[y];
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        

        for(int i=0; i<n-1; i++){
            boolean flag = false;
            for(int j = 0; j<n-i-1 ;j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }  
            
            if(!flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};

        bubbleSort(arr);

        System.out.print("Sorted Array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    
}
