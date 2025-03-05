package assignments.assigment_Arrays;

import java.util.Arrays;

public class MatrixMultiplication_3 {
    public static void main(String[] args) {

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] matrix2 ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rows1=matrix1.length;
        int cols1=matrix1[0].length;
        int rows2=matrix2.length;
        int cols2=matrix2[0].length;
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int[][] result = new int[rows1][cols2];

        for(int i=0;i<rows1;i++){
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rows1; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
