public class InsertionSort6 {
    public static void main(String[] args) {
        int[] array = {20,35,-15,7,55,1,-22};
        insertionSort(array);
        print(array);
    }

    public static void insertionSort(int[] arr) {
        
        for(int firstUnsortedIndex = 1;firstUnsortedIndex<arr.length;firstUnsortedIndex++){
            int newElement = arr[firstUnsortedIndex];

            int i;
            for(i=firstUnsortedIndex-1;i>=0;i--){  // Remember it there is no other way
                if(newElement < arr[i]){
                    arr[i+1] = arr[i];
                }else{
                    break;
                }
                
            }

            arr[i+1] = newElement;
        }


    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
