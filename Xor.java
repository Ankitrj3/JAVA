import java.util.*;
public class Xor {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int a = Integer.parseInt(sc.nextLine(),2);
       int b = Integer.parseInt(sc.nextLine(),2);

       int resultxor = a^b;
       System.out.println(resultxor);
    }
}
