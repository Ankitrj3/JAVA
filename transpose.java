import java.util.*;

public class transpose{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the size of matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        // declaration of array matrix
        int arr [][] = new int[n][m];
        // taking the input value in matrix
        System.out.println("enter the value in the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("printing the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println("");

        System.out.println("Transpose the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
        }
    }
}