import java.util.*;

public class TransposeMatrix {
    public void transpose(int matrix1[][]) {
        int row = matrix1.length;
        int cols = matrix1[0].length;
        int result[][] = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix1[i][j];
            }
        }


        System.out.println("The answer of the transpose matrix is:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner ank = new Scanner(System.in);
        int row = ank.nextInt();
        int cols = ank.nextInt();
        int matrix1[][] = new int[row][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = ank.nextInt();
            }
        }

        TransposeMatrix m = new TransposeMatrix();
        m.transpose(matrix1);
    }
}
