import java.util.*;
public class Asccicode {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        System.out.println("enter the character to find the ascii code");
        char a = ank.next().charAt(0);

        int n = (int)a;
        System.out.println("the ascii value "+n);
        ank.close();
    }
}
