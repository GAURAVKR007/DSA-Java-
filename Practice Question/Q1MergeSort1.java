import java.util.Scanner;

public class Q1MergeSort1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("\nEnter the Elements in the Array : ");

        for (int i = 0; i < n; i++) {
            System.out.print("\nArray [" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        sc.close();

        int start = 0;

        mergeSort(arr, start, n-1);

        System.out.println("\n================================");
        print(arr);
        System.out.println("\n================================");

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid); // For Left Part
        mergeSort(arr, mid + 1, end); // For Right Part
        merge(arr, start, mid, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int idx1 = start;
        int idx2 = mid+1;

        int[] tempArr = new int[end - start + 1];
        int k = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                tempArr[k++] = arr[idx1++];
            } else {
                tempArr[k++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            tempArr[k++] = arr[idx1++];
        }

        while (idx2 <= end) {
            tempArr[k++] = arr[idx2++];
        }

        for (int i = 0,j=start; i < tempArr.length; i++,j++) {
            arr[j] = tempArr[i];
        }
    }

    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}