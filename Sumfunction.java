import java.util.*;

public class Sumfunction {
    public void sum1(int arr[]){
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i]; 
        }

        System.out.println("sum of the array");
        
            System.out.println("the sum of array is "+sum);
        
    }

    public static void main(String args[]){
         Scanner ank = new Scanner(System.in);
         System.out.println("enter the size of the array");
         int n = ank.nextInt();

         int arr[] = new int[n];

         for(int i=0;i<arr.length;i++){
            arr[i] = ank.nextInt();
         }
         Sumfunction su = new Sumfunction();

         su.sum1(arr);
    }
}
