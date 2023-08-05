import java.util.Arrays;

public class ArraySubsetOfAnotherArray {

    public static String isSubset( int a1[], int a2[]) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if(a1.length < 1 || a2.length < 1){
            return "No";
        }
        
        int idx1 = 0;
        int idx2 = 0;
        
        while(idx1 < a1.length && idx2 < a2.length){
            if(a1[idx1] == a2[idx2]){
                idx1++;
                idx2++;
            }else{
                idx1++;
            }
        }
        
        if(idx2 == a2.length){
            return "Yes";
        }
        
        return "No";
        
        
        
    }

    public static void main(String[] args) {
        int[] arr1 = {589 ,5847 ,595 ,959 ,258};
        int[] arr2 = {258 ,25};

        String str = isSubset(arr1, arr2);

        System.out.println(str);


    }
}
