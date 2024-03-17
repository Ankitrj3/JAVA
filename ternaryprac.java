import java.util.*;
public class ternaryprac {
    public static void main(String[] args) {
        Scanner ank = new Scanner(System.in);
        int a = ank.nextInt();

        String res = (a<0) ? "Negative":"Positive";
        System.out.println(res);
    }
}
