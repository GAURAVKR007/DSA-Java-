class PrintSum {

    public static int printSum(int i,int n,int sum){
        if(i == n+1) return sum;
        sum += i++;
        sum = printSum(i, n, sum);

        return sum;
    }
    public static void main(String[] args) {
        System.out.println( printSum(1,5,0));
    }    
}
