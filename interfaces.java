// in interface by default the methods are public abstract
// interface is like a class

// in interface if we want to extends the interface in class we use implements keyword in the class
// when we are using implements keyword in class then it becomes compelsoury to define the interface methods in the class

interface A{
    int age = 12;
    int roll =33;
    String name = "ankit";
    // if declare the variables in inteface then we can't edit the varible
    // these varible are final and static 
    void show();
    void config();
}
// interfaces are mainly used for methods
// interfaces havn't have there own heap memory 
class B implements A{
    public void show(){
        System.out.println("hello " +name);
    }
    public void config(){
        System.out.println("your age "+age+" and your roll no. is "+roll);
    }
}
public class interfaces{
      public static void main(String args []){
        B obj = new B();
        obj.show();
        obj.config();
      }
}

// if want to inherit interface to interface we use keyword extend only
// class - class -> extends
// interface - class -> implements
// class - interface -> implements
// interface - interface -> extends