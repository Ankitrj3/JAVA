import java.util.*;
public class Plandrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;
        int reversed1 = 0;
        while(n>0){
            int digit = n%10;
            reversed1 = reversed1*10+digit;
            n/=10;
        }
        if(k==reversed1){
            System.out.println("This number is plaindrome");
            System.out.println("Your entered value is "+k);
            System.out.println("Your reversed value is "+reversed1);
        }else{
            System.out.println("This number is not an plaindrome");
            System.out.println("Your entered value is "+k);
            System.out.println("Your reversed value is "+reversed1);
        }
    }
}
