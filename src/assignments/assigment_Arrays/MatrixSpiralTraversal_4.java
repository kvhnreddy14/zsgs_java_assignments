package assignments.assigment_Arrays;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralTraversal_4 {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println(res.toString());
    }
}
