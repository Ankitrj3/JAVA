import java.util.*; 
public class Reversearray {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        int n = ank.nextInt();

        int arr [] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = ank.nextInt();
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
