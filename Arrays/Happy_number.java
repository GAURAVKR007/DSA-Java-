class Happy {
    public boolean isHappy(int n) {
        int number = 0; // = some int
        
        while(n>9){

            while(n>0){
            number += (n % 10)*(n%10);
            n = n/10;
            }

            n = number;
            number = 0;
        }

        if(n==1 || n==7){
            return true;
        }

        return false;
    }
}

public class Happy_number {
    public static void main(String[] args) {
        int num = 19;

        Happy one = new Happy();
        System.out.println(one.isHappy(num)); 
    }
}
