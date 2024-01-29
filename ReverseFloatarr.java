import java.util.*;
public class ReverseFloatarr {
    public static void main(String args[]){
       Scanner ank = new Scanner(System.in);

       int n = ank.nextInt();
       float arr [] = new float[n];
       for(int i=0;i<n;i++){
         arr[i] = ank.nextFloat();
       }

       int left = 0;
       int right = arr.length-1;

       while (left<right) {
        float temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }

       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }
    }
}
