import java.util.*;
public class prac {

    public static void main(String args[]){
    Scanner ank = new Scanner(System.in);

    int  n = ank.nextInt();

    int arr []= new int[n];

    for(int i=0;i<n;i++){
        arr[i] = ank.nextInt();
    }

    // now i will use bubble sort

    for(int counter=0;counter<n;counter++){
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    }

}
