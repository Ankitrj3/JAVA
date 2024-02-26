import java.util.*;
public class PracAscii {
    public static void main(String args[]){
       Scanner ank = new Scanner(System.in);
       System.out.println("enter the character to find ascii code");
       char a = ank.next().charAt(0);

       int n = (int)a;
       System.out.println("ascii code "+n);
    }
}
