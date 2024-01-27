import java.util.*;
public class BooleanCheckFirstAndLast {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array");
         int n = sc.nextInt();

         System.out.println("enter the element in the array");
         int arr [] = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }

         System.out.println("enter the element to check last anf first element in the array");
         int ele = sc.nextInt();

         if(arr[0]==ele && arr[arr.length-1]==ele){
            System.out.println("true");
         }else{
            System.out.println("false");
         }

    }
}
