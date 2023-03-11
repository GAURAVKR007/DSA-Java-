class PrintNumbers {

    public static void printNum(int x){
            if(x>5) return;            

            System.out.println(x);
            printNum(x+1);    // Full Recursion
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);
    }
}