public class SelectionSort5 {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};

        selectionSort(array);

        print(array);

    }

    public static void selectionSort(int[] arr) {

        

        for(int lastUnsortedIndex = arr.length -1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;

            for(int i=1;i<=lastUnsortedIndex;i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }

            swap(arr, largest, lastUnsortedIndex);

        }
    }

    public static void swap(int[] arr,int i,int j){

        if(i==j){
            return;
        }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        

    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
