import java.util.*;
public class BubbleSortprac {

    void bubblesort(int arr[],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                 if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }
    }
    public static void main(String args[]){
         Scanner ank = new Scanner(System.in);
         System.out.println("Enter the size of array");
         int n = ank.nextInt();

         System.out.println("Enter the elements");
         int arr[] = new int[n];

         for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
         }
         
         BubbleSortprac b = new BubbleSortprac();

         b.bubblesort(arr,n);
         
         System.out.println("Sorted array");
         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }




    }
}
