class Re {
    public int removeElement(int[] nums, int val) {
        int last = nums.length-1;
        int i=0;
        while(last>=i){

            if(nums[i]==val){
                for(int k=i;k<last;k++){
                    int temp = nums[k+1];
                    nums[k+1] = nums[k];
                    nums[k] = temp;
                }
                last = last-1;
                
            }
            
            if(nums[i]!=val){
                i++;
            }

           
        }

        return i;
    }
}


public class removeElement {
    public static void main(String[] args) {
        Re rm = new Re(); 
        int[] arr = {3,3};
        int val = 2;

        int k = rm.removeElement(arr, val);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
