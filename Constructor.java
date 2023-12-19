import java.util.concurrent.locks.Condition;

public class Constructor{
    String name;
    int age;
    float salary;

    Constructor(){
        System.out.println("we have created default constructor");
    }
    Constructor(String name , int age , float salary){
        this.age = age;
        this.name = name;
        this.salary = salary;

        System.out.println("your age is "+age);
        System.out.println("your name is "+name);
        System.out.println("your salary is "+salary);
    }
    Constructor(Constructor s2){
        this.age = s2.age;
        this.name = s2.name;
        this.salary = s2.salary;

        System.out.println("your age in copy constructor is "+age);
        System.out.println("your name in copy constructor is "+name);
        System.out.println("your salary in copy constructor is "+salary);
    }
    public static void main(String args []){
        Constructor a = new Constructor();
        Constructor s = new Constructor("ankit",132,122);
        Constructor s2 = new Constructor("robin",12,45);
        Constructor s3 = new Constructor(s2);
        
    }
}