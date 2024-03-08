import java.util.Arrays;
import java.util.*;
public class PakageArray2 {


    public static void main(String[] args) {
       
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();
 
        int myArray[] = new int[n];
        System.out.println("Enter elements "+n+" : ");
        for(int i=0;i<n;i++){
            myArray[i] = ank.nextInt();
        }
        
        Arrays.sort(myArray);

     
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}


