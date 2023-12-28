import java.util.*;

public class array1{
    public static void main(String[] args) {
        int nums [] = {12,34,231,45};

        for(int i=0;i<4;i++){
           System.out.println(nums[i]);
        }
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int num[] = new int[n];

        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("printing the value");
        for(int i=0;i<n;i++){
            System.out.println(num[i]);
        }
        
    }
}