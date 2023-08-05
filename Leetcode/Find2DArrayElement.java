public class Find2DArrayElement {

    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
                return false;
        }
        
        int low = 0;
        int row = matrix.length;
        int columns = matrix[0].length;

        int high = row * columns - 1;

        while(low <= high){
            int mid = (high + low) / 2;

            int r = mid/columns;

            int c = mid%columns;

            if(matrix[r][c] == target){
                return true;
            }

            if(matrix[r][c] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        boolean isTrue = searchMatrix(matrix, 5);

        System.out.println(isTrue);
    }
}
