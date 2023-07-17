class PrintSum {

    // public static int printSum(int i,int n,int sum){
    //     if(i == n+1) return sum;
    //     sum += i++;
    //     sum = printSum(i, n, sum);

    //     return sum;
    // }
    // public static void main(String[] args) {
    //     System.out.println( printSum(1,5,0));
    // }    

    public static void printSum(int end,int sum){
        if(end<1){
            System.out.println(sum);
            return;
        }
        sum = sum+end;
        printSum(end-1, sum);
    }

    public static void main(String[] args) {
        int end = 5;
        int sum = 0;
        printSum(end, sum);
    }
}
