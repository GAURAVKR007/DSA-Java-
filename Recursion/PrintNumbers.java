class PrintNumbers {

    // public static void printNum(int x){
    //         if(x>5) return;            

    //         System.out.println(x);
    //         printNum(x+1);    // Full Recursion
    // }
    // public static void main(String[] args) {
    //     int n=1;
    //     printNum(n);
    // }

    // public static void printNum(int start,int end){
    //     if(start > end){
    //         return;
    //     }

    //     System.out.print(start+" ");
    //     start++;

    //     printNum(start, end);
    // }

    // public static void main(String[] args) {
    //     int start = 1,end = 50;
    //     printNum(start, end);
    // }

    // BackTracking

    public static void printNum(int s,int n){
        if(s>n){
            return;
        }

        printNum(s+1, n);
        System.out.println(s);
    }

    public static void main(String[] args) {
        int end  = 5;
        int start = 1;
        printNum(start,end);
    }
}