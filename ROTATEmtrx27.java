public class ROTATEmtrx27 {

    public static void rot(int matrix[][]){
        //transpose
        int n=matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
             int temp= matrix[i][j];
             matrix[i][j] = matrix[i][matrix.length - 1 - j];
             matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rot(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.err.println();

        }
    }
}
