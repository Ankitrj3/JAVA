import java.util.*;

// compile time is method overloading
// runtime is method overiding

class a{
    public void show(){
        System.out.println("show a");
    }

}
class b extends a{
    public void show(){
        System.out.println("show b");
    }

}
class c extends a{

}

public class Second{
    public static void main(String args []){
        b obj = new b();
        obj.show();
        
        c ob = new c();
        ob.show();


    }
}