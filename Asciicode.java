import java.util.*;

public class Asciicode {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element to find ascii code to that item");
        char a = sc.next().charAt(0);
        int ascii = (int)a;
        System.out.println(ascii);
    }
}
