class OddFirst {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    public static int find(){
          int[][] mat = {{10,20,30, 40}, {15 ,25, 35, 45},{27 ,29, 37 ,48},{32, 33 ,39 ,50}};

       int M = 4; 
       int N = 4;

       int X = 45;

        
       int i = 0; // Start from the top-left corner
        int j = M - 1; // Start from the top-right corner

        while (i < N && j >= 0) {
            if (mat[i][j] == X) {
                return 1; // Found the target element
            } else if (mat[i][j] > X) {
                j--; // Move to the left in the same row
            } else {
                i++; // Move to the next row
            }
        }

        return 0; // If the loop exits, the element is not found
    }

    public static void revstr(){
        String S = "i.like.this.program.very.much";

        String[] str = S.split("\\.");
        for(int i= 0; i < str.length/2; i++){
            String temp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i - 1] = temp;
        }
        
         String result = String.join(".", str);
         
         System.out.println(result);
    }

    public static void main(String[] args) {
     
        // int val = find();

        // System.out.println(val);

        // revstr();

        // int p = 3;
        // int q = 4 ,q1 = 9;



        // String a = "";
        // while(q1 > 0){
        //     Integer mod = new Integer( q1%2);
        //     a =mod.toString() + a  ;
        //     q1 = q1/2;
        // }

        // int num = 1237;

        // int rev = 0;

        // while(num > 0){
        //     int last = num % 10;
        //     rev = rev * 10 + last;
        //     num = num / 10;
        // }

        // System.out.println(rev);


        // double a = 77;
        // double b = 47;

        // double percent = 0;

        // percent = (a * b ) / 100d;

        // System.out.println("Percent : "+percent);


        // 4 -> 100

        // System.out.println("Answer : "+ a);



        // byte a = (8%2) / 2;
        


        // System.out.println(a);

        // Hello Awaz Aa rhi hai ?



        // System.out.println(Integer.toBinaryString(p));
        // System.out.println(Integer.toBinaryString(q));
    //    for(int x : arr){
    //     System.out.print(x+" ");
    //    }


        



    }


}