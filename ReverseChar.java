import java.util.*;
public class ReverseChar {
    public static void main(String args[]){
         Scanner ank = new Scanner(System.in);
         char arr[] = {'a','b','c','d','e'};

         int i = 0;
         int j = arr.length-1;

         while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k=0;k<arr.length;k++){
           System.out.println(arr[k]);
        }
          

        }
}
