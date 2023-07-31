class RotateArray {

    public static void rotate(int[] nums, int k) {
        int rotation = k % nums.length;
        int temp = 0;
        int l = 1;

        for(int i=0;i<rotation;i++){
            for(int j=nums.length - 1; j>=0; j--){

                if(j == nums.length-1){
                    temp = nums[0];
                    nums[0] = nums[nums.length - 1];
                }else{
                    int temp2 = temp;
                    temp = nums[l];
                    nums[l++] = temp2;

                }
            }

            l = 1;
            temp = 0;
        }
    }

    public static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int rotation = d % n;
        int temp = 0;
        int l = n-1;

        for(int i=0;i<rotation;i++){
            for(int j=0; j<n; j++){

                if(j == 0){
                    temp = arr[n-1];
                    arr[n-1] = arr[0];
                }else{
                    int temp2 = temp;
                    temp = arr[l-1];
                    arr[--l] = temp2;

                }
            }

            l = n-1;
            temp = 0;
        }
    }

    public static void reverse(int[] arr,int start, int end){
        int endArr = end;
        int startArr = start;
        for(int i=0; i<=(endArr - startArr)/2; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeet(int[] nums, int k) {
        int rotation = k % nums.length;

        if (rotation == 0) {
        return;
        }

        reverse(nums,0,nums.length -1);
        reverse(nums,0,rotation-1);
        reverse(nums,rotation,nums.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int rotate = 2;

        rotateLeet(arr, rotate);

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}