public class ShellSort1 {
    public static void main(String[] args) {
        
        int[] array = {20,35,-15,7,55,1,-22};
        System.out.print("Before Shell Sort : ");
        print(array);

        for(int gap = array.length/2;gap>0;gap = gap/2) {

            for(int i = gap;i<array.length;i++) {
                int newElement = array[i];

                int j = i;

                while(j>=gap && array[j-gap] > newElement) {
                    array[j] = array[j-gap];
                    j = j - gap;
                }

                array[j]  = newElement;
            }

        }
        System.out.println("\n===========================");
        System.out.print("After Shell Sort : ");
        print(array);
        System.out.println("\n===========================");

    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
    }
}