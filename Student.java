public class Student{
    String name;
    int age;
    String address;

    public void getdata(){
        System.out.println("your name is "+name);
        System.out.println("your age "+age);
        System.out.println("student address is "+address);
    }
    public static void main(String args []){
        Student s = new Student();
        s.name = "ankit ranjan";
        s.age = 20;
        s.address = "ayodya nagar";
        s.getdata();
    }
}