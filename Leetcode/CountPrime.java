public class CountPrime {
    public static int countPrimes(int n) {
        if(n == 0 || n== 1){
            return 0;
        }

        boolean[] prime = new boolean[n+1];
        prime[0] = false;
        prime[1] = false;
        int count = 0;
        for(int i=2;i<=n;i++){
            prime[i] = true;
        }

        for(int i=2; i*i <= n ; i++){
            if(prime[i] == true){
                for(int j=i*i ; j<=n; j=j+i){
                    prime[j] = false;
                }
            }
        }

        for(boolean x : prime){
            if(x == true){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(2));
    }
}
