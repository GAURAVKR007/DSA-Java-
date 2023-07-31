public class MinimumSpeed {

    public static double less(int[] dist,double hour ,double num,double totalTime){
        for(int x: dist){
            if(totalTime > (int) totalTime){
                totalTime = (double) ((int) totalTime + 1);
            }
            totalTime += (double) x / (double) num;
        }

        return totalTime;
    }

    public static int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length - 1 >= hour ){
            return -1;
        }

        int left = 1;
        int right = 100;

         int mid = 0;

        

        while(left < right){
        double totalTime = 0;
         mid = (right + left) / 2;
            
            totalTime = less(dist,hour,mid,totalTime);

            if(totalTime <= hour){
                right = mid;
            }else{
                left = mid+1;
            }

        }

        int speed = left;

        return speed;
    }
    public static void main(String[] args) {
        int[] dist = {1,3,2};
        double hour = 6;

        int speed = minSpeedOnTime(dist, hour);

        System.out.println(speed);

    }
}
