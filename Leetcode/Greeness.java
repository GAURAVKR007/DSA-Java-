public class Greeness {
    public static int[] calcGreenSide(int[] gardenGreenness){
    int n = gardenGreenness.length;
    int[] greennessOnOtherSide = new int[n];

    int[] leftMax = new int[n];
    int[] rightMax = new int[n];

    // Calculate maximum greenness values on the left side
    leftMax[0] = Integer.MIN_VALUE;
    for (int i = 1; i < n; i++) {
        leftMax[i] = Math.max(leftMax[i - 1], gardenGreenness[i - 1]);
    }

    // Calculate maximum greenness values on the right side
    rightMax[n - 1] = Integer.MIN_VALUE;
    for (int i = n - 2; i >= 0; i--) {
        rightMax[i] = Math.max(rightMax[i + 1], gardenGreenness[i + 1]);
    }

    // Calculate "greenness on the other side" for each garden
    for (int i = 0; i < n; i++) {
        greennessOnOtherSide[i] = Math.max(leftMax[i], rightMax[i]);
    }

    return greennessOnOtherSide;
        }
        
        public static void main(String[] args) {
          
      
          int[] arr = {10, 2, 4, 3};
      
          int[] greenOtherSide = calcGreenSide(arr);
      
          for(int i=0; i< arr.length ; i++){
            System.out.println(greenOtherSide[i]);
          }
          
        }
}
