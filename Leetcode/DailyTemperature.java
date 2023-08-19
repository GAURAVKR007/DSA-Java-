public class DailyTemperature {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];

        for(int i=n-1 ; i>=0 ; i--){
            
            int count = 0;
            boolean flag = false;
            for(int j = i; j<n-1;j++){
                if(temperatures[i] < temperatures[j+1]){
                    flag = true;
                    count++;
                    break;
                }
                count++;
            }

            arr[i] = flag == true ? count : 0;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] arr = dailyTemperatures(temperatures);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
