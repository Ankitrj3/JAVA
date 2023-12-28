// final keyword is like constant variable we can't re define the varible 

final class a{
    public void main(){
        System.out.println("hello ankit ");
    }
}

// class b extends a{  //when we make our class using final we can't inherit that particular class 

// }

class k{
    public final void main(){
        System.out.println("hello");
    }
   
}

// class j extends k{   // now this code will error because we can't override the function using final keyword 
//     public void main(){
//         System.out.println("hola");
//     }
// }


public class Finalkeyword{
    public static void main(String args []){

        int v =342;
        System.out.println(v);
        v = 67;
        System.out.println(v);
        final int a = 12;
        System.out.println(a);
        // int a = 43;
        // System.out.println(a);

        // b n = new b();//if run this code by creating the object it will give the error 
        // n.main();
    }
}