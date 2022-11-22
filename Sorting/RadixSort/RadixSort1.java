class RadixSort1 {
    public static void main(String[] args) {
        
        int[] radixArray = {4725,4586,1330,8792,1594,5729};

        radixSort(radixArray,10,4);

        print(radixArray);
    }

    public static void radixSort(int[] input,int radix,int width) {
        for(int i=0;i<width;i++){
            radixSingleSort(input,i,radix);
        }
    }

    public static void radixSingleSort(int[] input,int position,int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        
        for(int value: input){
            countArray[getDigit(position,value,radix)]++;
        }

        // Adjust the count Array 
        for(int i = 1;i<radix;i++){
            countArray[i] += countArray[i-1];
        }

        int[] temp = new int[numItems];
        for(int tempIndex=numItems -1;tempIndex>=0;tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }

        for(int i = 0;i<numItems;i++){
            input[i] = temp[i];
        }
    }

    public static int getDigit(int position,int value,int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }


    public static void print(int[] arr) {
        System.out.print("Array is : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] +" ");
        }
}
}