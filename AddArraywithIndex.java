import java.util.*;

public class AddArraywithIndex {
    public void addArraywithIndex(int arr[]){
        
        int arr1[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            arr1[i] = arr[i]+(i+1);
        }
        System.out.println("array after adding there position");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }

    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
        }

        AddArraywithIndex a = new AddArraywithIndex();
        a.addArraywithIndex(arr);
    }
}
