import java.util.*;
public class SearchElementAtFirstOrLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the seraching element");
        int element = sc.nextInt();
        if (arr[0] == element || arr[arr.length-1]==element) {
             System.out.println(true);   
        }else{
            System.out.println(false);
        }
    }
}
