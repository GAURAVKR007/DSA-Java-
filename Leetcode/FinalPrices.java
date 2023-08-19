import java.util.Stack;

class FinalPrices {

     public static int[] finalPrices(int[] prices) {
        int n = prices.length;

        Stack<Integer> stack = new Stack<>();

        int[] arr = new int[n];

        for(int i=n-1;i>=0;i--){
            boolean found = false;
            while(!stack.isEmpty()){
                if(prices[i] < stack.peek()){
                stack.pop();
                }else{
                    arr[i] = prices[i] - stack.peek();
                    found = true;
                    break;
                }
            }

            if(!found) {
                arr[i] = prices[i];
            }
            stack.push(prices[i]);

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};

        int[] arr = finalPrices(prices);

        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}