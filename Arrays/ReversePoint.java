import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class ReversePoint 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int j = 1;
        for (int i = m+1; i < (arr.size() + (m+1))/2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - j));
            arr.set(arr.size() - j, temp);
            j++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr.size());

        reverseArray(arr, 3);

        for( int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
