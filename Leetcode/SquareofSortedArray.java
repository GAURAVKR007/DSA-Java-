class SquareofSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int idx1 = 0;
        int idx2 = nums.length-1;
        int lastIndex = nums.length -1;

        int firstTemp = Math.abs(nums[idx1]*nums[idx1]);
        int lastTemp = Math.abs(nums[idx2]*nums[idx2]);

        while(idx1<idx2){

            if(firstTemp <= lastTemp){
                arr[lastIndex--] = lastTemp;
                idx2--;
                lastTemp = Math.abs(nums[idx2]*nums[idx2]);
                continue;
            }

            if(firstTemp > lastTemp){
                arr[lastIndex--] = firstTemp;
                idx1++;
                firstTemp = Math.abs(nums[idx1]*nums[idx1]);
                continue;
            }
        }

        arr[0] = lastTemp;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,2};

        int[] res = sortedSquares(arr);

        for(int x : res){
            System.out.print(x+" ");
        }
    }
}