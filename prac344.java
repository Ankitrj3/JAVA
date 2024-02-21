import java.util.*;

public class prac344 {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int n = ank.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
        }
        System.out.println("enter the key which do you want to search");
        int key = ank.nextInt();
        
        boolean a = true;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("your element found at index no "+i);
                a = false;
                break;
            }

        }
        if(a==true){
            System.out.println("your element not found");
        }



    }
}
