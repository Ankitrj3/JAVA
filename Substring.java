import java.util.*;
public class Substring {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = ank.nextLine();
        System.out.println("enter the starting point for string");
        int n = ank.nextInt();
        System.out.println("enter the ending point for string");
        int m = ank.nextInt();

        String a = str.substring(n,m);
        System.out.println(a);
    }
}
