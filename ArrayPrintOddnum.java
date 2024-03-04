import java.util.*;
public class ArrayPrintOddnum {

    public static void main(String args[]){
         Scanner ank = new Scanner(System.in);
         System.out.println("enter the size of array");
         int n = ank.nextInt();

         int arr[] = new int[n];
        
         System.out.println("enter the elements in the array");
         for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i] = ank.nextInt();
         }
         boolean a = false;
         for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                System.out.println(arr[i]);
                a = true;
            }
         }
        
         if(a==false){
            System.out.println("in array no odd elements is present.");
         }


    }
}


