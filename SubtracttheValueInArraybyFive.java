import java.util.*;
public class SubtracttheValueInArraybyFive {
    public void subtracttheValueInArraybyFive(int arr[]){
        int subarr1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            subarr1[i] = arr[i] -5;
        }
        System.out.println("printing the array value after the subtraction of five");
        for(int i=0;i<subarr1.length;i++){
            System.out.println(subarr1[i]);
        }

    }
        public static void main(String args[]){
            Scanner ank = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int n = ank.nextInt();

            int arr [] = new int[n];
            
            System.out.println("enter the elements in array");
            for(int i=0;i<arr.length;i++){
                arr[i] = ank.nextInt();
            }
            SubtracttheValueInArraybyFive s = new SubtracttheValueInArraybyFive();

            s.subtracttheValueInArraybyFive(arr);
        }
}
