public class Q_74 {
    public static void main(String[] args) {
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows= matrix.length;
        int columns= matrix[0].length;
        int top=0,bot=rows-1;
        while(top<=bot){
            int mid=(top+bot)/2;
            if(matrix[mid][columns-1]<target){
                top=mid+1;
            }

            else if (matrix[mid][0]>target){
                bot=mid-1;
            }
            else{
                break;
            }
        }
        if(!(top<=bot)){
            return false;
        }
        int row=(top+bot)/2;
        int left=0,right=columns-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[row][mid]<target){
                left=mid+1;
            } else if (matrix[row][mid]>target) {
                right=mid-1;
            }
            else return true;
        }
        return false;
    }
}
