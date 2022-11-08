public class MergingTwoSortedArray {
    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {0,2,4,6,8,10};

        int [] finalArray = sortTwoSortedArray(arr1,arr2);

        print(finalArray);


    }

    public static int[] sortTwoSortedArray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] finalArray = new int[n+m];
        int k = 0;

        int idx1 = 0;
        int idx2 = 0;

        while(idx1<n && idx2<m){
            if(arr1[idx1] <= arr2[idx2]){
                finalArray[k++] = arr1[idx1++];
            }else{
                finalArray[k++] = arr2[idx2++];
            }
        }

        while(idx1 < n){
            finalArray[k++] = arr1[idx1++];
        }

        while(idx2 < m){
            finalArray[k++] = arr2[idx2++];
        }

        return finalArray;


    }

    public static void print(int[] arr) {
        System.out.print("\nResult : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}