public class JumpGame {
    public static boolean canJump(int[] nums) {
 
        if(nums.length == 1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
           if(nums[i] == 0){

               if(i == 0){
                   return false;
               }


               if(i == nums.length -1){
                    int count = 1;
                    boolean flag = false;

                for(int j = i-1; j >= 0; j--){
                    if(nums[j] >= count){
                        flag = true;
                    }
                    count++;
                }

                if(!flag){
                    return false;
                }
               }else{
                int count = 1;
            boolean flag = false;

                for(int j = i-1; j >= 0; j--){
                    if(nums[j] > count){
                        flag = true;
                    }
                    count++;
                }

                if(!flag){
                    return false;
                }
               }

            
           } 
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
}
