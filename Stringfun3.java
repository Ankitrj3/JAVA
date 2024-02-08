import java.util.*;

public class Stringfun3 {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        
        System.out.println("enter the String ");
        String str = ank.nextLine();
        System.out.println("enter String from u wanna Spilt the String");
        String a = ank.next();

        String[] n = str.split(a);
        for(String j : n){
            System.out.println(j.trim());
        }

        
    }
}
