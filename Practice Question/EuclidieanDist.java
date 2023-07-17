// import java.util.ArrayList;
// import java.util.Scanner;

public class EuclidieanDist {

    public static void findDist(double x1, double x2, double y1, double y2) {

        double result = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));

        System.out.println("Answer: " + result);
    }

    public static void main(String[] args) {

    double[] arr = {2,10,2,6,11,11,6,9,6,4,1,2,5,10,4,9,10,12,7,5};

    for( int i = 0; i < arr.length; i = i+2) {
        findDist(arr[i], 4, arr[i+1], 4.25);
    } 

    }
}
