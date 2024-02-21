import java.util.*;

class parent{
    public void ankit(int a,int b){
        System.out.println(a+b);
    }
}
class child extends parent{
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
public class inheritan {
    public static void main(String args[]){
         child a = new child();
         a.ankit(12,3);
         a.sub(23, 4);

    }
}
