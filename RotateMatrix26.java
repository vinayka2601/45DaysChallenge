public class RotateMatrix26 {

    public static int[][] rotate(int matrix[][]){
        int n=matrix.length;
        int rotated[][] = new int[n][n];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][matrix.length-1-i]=matrix[i][j];
            }
        }
        return rotated;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int rotated[][] = rotate(matrix);
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }

}
}
