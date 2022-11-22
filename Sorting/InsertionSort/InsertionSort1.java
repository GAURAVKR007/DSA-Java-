class InsertionSort1 {
    public static void main(String[] args) {
        int[] myArray = {20,35,14,-15,55,77,1};

        System.out.print("Original Array is : ");
        print(myArray);

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length;firstUnsortedIndex++){
            int newElement = myArray[firstUnsortedIndex];

            int i;

            for(i= firstUnsortedIndex;i>0 && myArray[i -1]> newElement;i--){
                myArray[i] = myArray[i-1];
            }

            myArray[i] = newElement;
        }



        System.out.print("\nSorted Array using Insertion Sort : ");
        print(myArray);
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}