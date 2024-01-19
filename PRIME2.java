import java.util.*;
public class PRIME2 {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = true;
        if(n<=1){
            System.out.println(n+ " not prime");
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                a = false;
            }
        }
        if(a==true){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+ " not prime");
        }
    }
}
