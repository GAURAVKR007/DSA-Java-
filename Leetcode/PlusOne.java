public class PlusOne {

    public static int[] plusOne(int[] digits) {

        long num = 0;
        for(int x: digits){
            num = num*10 + x;
        }

        long newNum = num+1;
        int count = 0;

        while(newNum > 0){
            count++;
            newNum = newNum / 10;
        }

        newNum = num +1;

        int[] arr = new int[count];
        int i = count-1;

        while(newNum > 0){
            long x = newNum%10;
            arr[i--] = (int) x;
            newNum = newNum/10;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        int [] newArr = plusOne(arr);

        for(int x: newArr){
            System.out.print(x+" ");
        }
    }
}
