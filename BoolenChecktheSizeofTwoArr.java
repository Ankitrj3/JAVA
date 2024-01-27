import java.util.*;
public class BoolenChecktheSizeofTwoArr {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        int n = ank.nextInt();
        int m = ank.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[m];

        if(arr.length!=arr1.length){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
    }
}
