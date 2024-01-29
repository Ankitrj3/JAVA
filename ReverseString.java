import java.util.*;
public class ReverseString {
    public static void main(String args []){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();

        String arr [] = new String[n];

        System.out.println("enter the strings in array");
        for(int i=0;i<n;i++){
            arr[i] = ank.next();
        }

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("printing the reverse array");

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
