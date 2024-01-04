// quick sort code

import java.util.*;

class quick{
     public int quicksort(int arr[],int low,int high){
          int pivot = arr[high];
          int i = low-1;
          for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
          }
          int temp = arr[i+1];
          arr[i+1] = arr[high];
          arr[high] = temp;

          return (i+1);
     }
     public void quicks(int arr[],int low,int high){
        if(low<high){
        int pi = quicksort(arr, low, high);
        quicks(arr, low, pi-1);
        quicks(arr, pi+1, high);
     }
    }
}

public class practice2 {
    public static void main(String args []){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[] = new int [n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         quick q = new quick();
         q.quicks(arr, 0, n-1);
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }
    }
}