import java.util.*;
public class strreverse {
    public static void main(String[] args) {
       Scanner ank = new Scanner(System.in);
       String a = ank.nextLine();

        java.lang.StringBuilder am = new java.lang.StringBuilder();
        
        am.append(a);
        am.reverse();
        System.out.println(am);
    }
}
