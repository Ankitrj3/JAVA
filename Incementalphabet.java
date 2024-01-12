import java.util.*;

public class Incementalphabet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter alphabet to print next alphabet");
        char a = sc.next().charAt(0);
        int ascii = (int)a+1;
        char next = (char)ascii;
        System.out.println(next);
    }
}
