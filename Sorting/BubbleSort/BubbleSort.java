public class BubbleSort {
    public static void main(String[] args) {
        
        int[] myArray = {7,22,-15,76,45,98,2};

        System.out.print("Original Array is : ");
        print(myArray);

        System.out.println("");

        for(int lastCheckedIndex = myArray.length - 1; lastCheckedIndex>0; lastCheckedIndex--){
                for(int i=0;i<lastCheckedIndex;i++) {
                    if(myArray[i] > myArray[i+1]){
                        swap(myArray, i, i+1);
                    }
                }
        }
        System.out.print("Sorted Array is : ");
        print(myArray);

    }

    public static void print(int[] arr) {
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swap(int[] arr,int i,int j) {
        if(i==j){
            return;
        }

        // if(i>j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        // }
    }
}