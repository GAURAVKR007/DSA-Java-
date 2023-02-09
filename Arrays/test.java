public class test {
    public static void main(String[] args) {
        int[] arr = {1,4,3,6,9,23};
        int n = arr.length;
        int k = 2;
        
        for(int j=0;j<k;j++){
            for(int i=n-1;i>0;i--){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        
       
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
