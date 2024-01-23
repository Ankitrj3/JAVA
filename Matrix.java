import java.util.*;

public class Matrix {

    public void matrixaAdd(int arr1[][], int arr2[][]) {
    
        if (arr1.length != arr2.length || arr1[0].length != arr2[0].length) {
            System.out.println("Matrices are not of the same size");
            return;
        }

        int row = arr1.length;
        int cols = arr1[0].length;
        int[][] result = new int[row][cols];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

       
        System.out.println("Addition of matrices is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner ank = new Scanner(System.in);
        System.out.println("Enter the row & column for matrix 1");
        int row1 = ank.nextInt();
        int cols1 = ank.nextInt();
        System.out.println("Enter the row & column for matrix 2");
        int row2 = ank.nextInt();
        int cols2 = ank.nextInt();
        int matrix1[][] = new int[row1][cols1];
        int matrix2[][] = new int[row2][cols2];
        System.out.println("Enter the values in matrix 1");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = ank.nextInt();
            }
        }
        System.out.println("Enter the values in matrix 2");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = ank.nextInt();
            }
        }
        Matrix m = new Matrix();
        m.matrixaAdd(matrix1, matrix2);
    }
}
