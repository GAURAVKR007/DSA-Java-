public class Q9RadixSort
{
    public static void display(String arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		String arr[] = { "bcdef", "dbaqc", "abcde", "bbbbb" };
		display(arr);
		radixSort(arr,26,arr[0].length());
		display(arr);
	}
	
	public static void radixSort(String input[], int radix, int width){
	    for(int i=0;i<width;i++){
	        performRadixSort(input,i,radix);
	    }
	}
	public static void performRadixSort(String input[], int position, int radix){
	    int countArray[] = new int[radix];
	    int nos = input.length;
	    for(String value : input){
	        countArray[getDigit(position,value,radix)]++;
	    }
	    for(int i=1;i<radix;i++){
	        countArray[i] = countArray[i] + countArray[i-1];
	    }
	    String tempArray[] = new String[nos];
	    for(int i=nos-1;i>=0;i--){
	        tempArray[--countArray[getDigit(position,input[i],radix)]] = input[i];
	    }
	    
	    for(int i=0;i<nos;i++){
	        input[i] = tempArray[i];
	    }
	    
	}
        // get the ascii value of the character for example a = 0,b = 1 etc
	public static int getDigit(int position, String value, int radix){
	    int nos = value.length() - 1;
	    char c  = value.charAt(nos - position);
	    return (int)c-97;
	}
}
