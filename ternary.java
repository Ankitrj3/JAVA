import java.util.*;

class ternary{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result =( n%2==0 ) ?  "even" : "odd";
        System.out.println(result);
        
    }
}