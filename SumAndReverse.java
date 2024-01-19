import java.util.*;
public class SumAndReverse {
    public static void main(String[] args) {
        int rev = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            sum+=n%10;
            n/=10;
        }
        System.out.println("sum of digit "+sum);
        System.out.println("reverse "+rev);
    }
}
