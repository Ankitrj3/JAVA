import java.util.*;
public class prac3 {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();
        int arr [] = new int[n];
        
        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
           arr[i] = ank.nextInt();
        }

        System.out.println("printing the values of array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }


    }
}
