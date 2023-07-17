public class ReverseArray {

    // public static void reverseArray(int[] arr,int l,int r){
    //     if(l >= r){
    //         return;
    //     }

    //     int temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;

    //     reverseArray(arr, l+1, r-1);
    // }

    public static void reverseArray(int[] arr,int i){
        int n = arr.length;
        if(i >= n/2){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverseArray(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        // reverseArray(arr,0,arr.length -1);
        reverseArray(arr, 0);
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
