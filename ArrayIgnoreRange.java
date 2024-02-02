import java.util.*;
public class ArrayIgnoreRange {
    public void arrayIgnoreRange(int arr[],int ing1,int ing2){
        boolean istr = false;
        int sum = 0;
        for(int value : arr){
            if(value == ing1){
                istr = !istr;
            }else if(value == ing2){
                istr = !istr;
            }else if(!istr){
                sum+=value;
            }
        }
        System.out.println("the sum after ignoring the values "+sum);
    }
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = ank.nextInt();

        System.out.println("enter the elements in array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
        }
        System.out.println("enter ignore element 1");
        int ing1 = ank.nextInt();

        System.out.println("enter ignore element 2");
        int ing2 = ank.nextInt();

        ArrayIgnoreRange a = new ArrayIgnoreRange();
        a.arrayIgnoreRange(arr,ing1,ing2);
    }
}
