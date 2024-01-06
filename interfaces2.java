import java.util.*;
interface A{
    void getdata();
    void putdata();
}
interface B extends A{
    void print();
}

class C{
    public void print(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
    public void getdata(){
        System.out.println("hello");

    }
}


public class interfaces2 {
     public static void main(String args []){
          C o = new C();
          o.print();
          o.getdata();
     }
}
