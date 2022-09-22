class selectionSort1 {
    public static void main(String[] args) {
        
        int[] myArray = {20,35,14,-15,55,77,1};

        System.out.print("Original Array is : ");
        print(myArray);


        for(int lastUsortedIndex = myArray.length-1; lastUsortedIndex > 0; lastUsortedIndex--){
            int largest = 0;
            for(int i= 1; i <= lastUsortedIndex;i++){
               
                if(myArray[largest] < myArray[i] ){
                    largest = i;
                }

            }

            swap(myArray, largest, lastUsortedIndex);
        }

        System.out.print("\nSorted Array using Selectin Sort : ");
        print(myArray);
        

    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
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
}