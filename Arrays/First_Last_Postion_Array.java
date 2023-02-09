public class First_Last_Postion_Array {
    public static void main(String[] args) {
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int low = 0;
        int high = nums.length -1;

        while(low<=high){
            int mid = (high+low)/2;

            if(nums[mid] == target){
                res[0] = mid;
                res[1] = mid-1;
                break;
            }

            if(target < nums[mid]){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }

    
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
