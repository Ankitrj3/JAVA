import java.util.*;

class first {
    public int a;
    public int b;

    void add() {
        Scanner la = new Scanner(System.in);
        a = la.nextInt();
        b = la.nextInt();
        System.out.println(a + b);
    } 
}

class second extends first {
    void sub() {
        Scanner la = new Scanner(System.in);
        System.out.println(a - b);
    }
}

class third extends first {
    void mul() {
        System.out.println(a * b);
    }
}

public class inheritance {
    public static void main(String[] args) {
        third th = new third();
        th.add(); 
        th.mul();
    }
}
