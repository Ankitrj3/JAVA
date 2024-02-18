import java.util.*;
public class PrintFirstHalfLengthofString {
    public static void main(String[] args) {
        Scanner ank = new Scanner(System.in);
        String a = args[0];
        int lenght = a.length();
        int half = lenght/2;

        System.out.println(a.substring(0,half));
    }
}
