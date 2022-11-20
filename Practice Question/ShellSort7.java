public class ShellSort7 {
    public static void main(String[] args) {
        
        int[] array = {20,35,-15,7,55,1,-22};
        shellSort(array);
        print(array);
    }

    public static void shellSort(int[] arr) {
        
        for(int gap = arr.length/2; gap>0; gap /= 2) {
            for(int i = gap;i<arr.length;i++){
                int newElement = arr[i];

                int j = i;
                for(;j>=gap && arr[j - gap] > newElement;j -= gap){
                    arr[j] = arr[j-gap];
                }
                arr[j] = newElement;
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
