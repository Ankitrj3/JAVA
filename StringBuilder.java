import java.util.*;
public class StringBuilder {
    public static void main (String args[]){
        Scanner ank = new Scanner(System.in);
        String a = ank.nextLine();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        sb.append(a);
     
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.charAt(0));

        

    }
}
