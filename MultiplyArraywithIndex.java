import java.util.*;
public class MultiplyArraywithIndex {
    public void multiplyArraywithIndex(int arr[]){
        int multi[] = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            multi[i] = arr[i] * (i+1);
        }

        System.out.println("array after multipying the position");
        for(int i=0;i<multi.length;i++){
            System.out.println(multi[i]);
        }
    }
    public static void main(String args[]){
         Scanner ank = new Scanner(System.in);
         System.out.println("enter the size of array");
         int n = ank.nextInt();
         
         int arr [] = new int[n];

         System.out.println("enter the elements in array");

         for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
         }

         MultiplyArraywithIndex m = new MultiplyArraywithIndex();
         m.multiplyArraywithIndex(arr);


    }
}
