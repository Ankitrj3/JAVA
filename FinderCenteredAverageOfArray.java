import java.util.*;
public class FinderCenteredAverageOfArray {
    public void centeredAverage(int arr[]){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            count++;
        }

        System.out.println(sum/count);
    }
    public static void main(String[] args) {
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();
        
        int arr[] = new int[n];
        System.out.println("enter the elements in array");
        for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
        }
        
        FinderCenteredAverageOfArray f = new FinderCenteredAverageOfArray();
        f.centeredAverage(arr);
    }
}
