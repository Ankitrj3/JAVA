import java.util.*;

class A{
    public String name;
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
         name = sc.nextLine();
    }
    public void putdata(){
        System.out.println("your name is : "+name);
    }
}
class B extends A{
    public int roll;
    public void get(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your roll number");
        roll = sc.nextInt();
    }
    public void put(){
        System.out.println("your roll no is : "+roll);
    }
}
class C extends B{
    public String section;
    public void g(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your section ");
        section = sc.nextLine();
    }
    public void p(){
        System.out.println("your section is : "+section);
    }
}



public class multilevel {
    public static void main(String[] args) {
        C c = new C();
        c.getdata();
        c.get();
        c.g();
        c.putdata();
        c.put();
        c.p();
    }    
}
