public class Factorial {
    public static void main(String[] args) {
        
        System.out.println("Iterative Solution => "+iterativeFactorial(5));

        System.out.println("Recursive Solution => "+recursiveFactorial(5));
       
    }

    public static int recursiveFactorial(int num) {

        if(num == 0){
            return 1;
        }

        int fac = num * recursiveFactorial(num - 1);

        return fac;
    }

    public static int iterativeFactorial(int num) {

        if(num==0) {
            return 1;
        }

        int fac = 1;
        for(int i = 1;i<=num;i++){
            fac = fac*i;
        }

        return fac;
    }

}