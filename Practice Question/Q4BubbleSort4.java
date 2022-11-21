public class Q4BubbleSort4 {
    public static void main(String[] args) {

        int[] array = { 20, 35, -15, 7, 55, 1, -22 };

        bubbleSort(array);

        print(array);

    }

    public static void bubbleSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {   // Loops the array bubble the biggest element to right side

            for (int i = 0; i < lastUnsortedIndex; i++) {     // Loops the Array to find the  if (arr[i] > arr[i + 1]).
 
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }

        }
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
