import java.util.*;
public class CompareMultiple {
    public void compareArgu(int arr[],int arg1,int arg2){
        for(int values : arr){
            if(values%arg1==0 && values%arg2==0){
                System.out.println(values+" this is a multiple of "+arg1+" and "+arg2);
            }else if(values%arg1==0){
                System.out.println(values+" this is a multiple of "+arg1);
            }else if(values%arg2==0){
                System.out.println(values+" this is a multiple of "+arg2);
            }else{
                System.out.println(values);
            }
        }
    }
    public static void main(String args[]){
       Scanner ank = new Scanner(System.in);
       System.out.println("enter the size of array");
       int n = ank.nextInt();
       
       int arr[] = new int[n];
       System.out.println("enter elements in array");
       for(int i=0;i<n;i++){
        arr[i] = ank.nextInt();
       }
       System.out.println("enter the args 1 to compare");
       int j = ank.nextInt();

       System.out.println("enter the args 2 to compare");
       int k = ank.nextInt();

       CompareMultiple m = new CompareMultiple();
       m.compareArgu(arr, j, k);

       
    }
}
