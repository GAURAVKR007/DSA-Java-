public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7};
        insertionSort(array,array.length);
        print(array);
    }

    public static void insertionSort(int[] arr,int numItems) {
        
        // for(int firstUnsortedIndex = 1;firstUnsortedIndex<arr.length;firstUnsortedIndex++){
        //     int newElement = arr[firstUnsortedIndex];

        //     int i;
        //     for(i=firstUnsortedIndex-1;i>=0;i--){  // Remember it there is no other way
        //         if(newElement < arr[i]){
        //             arr[i+1] = arr[i];
        //         }else{
        //             break;
        //         }
                
        //     }

        //     arr[i+1] = newElement;
        // }

        if(numItems<2){
            return;
        }

        insertionSort(arr, numItems -1);
        int i;

        int newElement = arr[numItems - 1];

             for(i=numItems-2;i>=0;i--){  // Remember it there is no other way
                if(newElement < arr[i]){
                    arr[i+1] = arr[i];
                }else{
                    break;
                }
                
            }

            arr[i+1] = newElement;
        }
       


    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
