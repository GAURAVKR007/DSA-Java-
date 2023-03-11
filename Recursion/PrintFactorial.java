public class PrintFactorial {

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }

        int fac = num * factorial(num-1);
        return fac;
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
 