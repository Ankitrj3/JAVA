import java.util.*;

class Anki{
    double sal;
    void getdata(){
        Scanner ank = new Scanner(System.in);
        System.out.println("Enter the salary");
        sal = ank.nextDouble();
        System.out.println("Current salary of employee : "+sal);
    }
}
class Robin extends Anki{
    void getdata(){
        Scanner ank = new Scanner(System.in);
        System.out.println("Enter Bonus");
        double bonus = ank.nextDouble();
        System.out.println("Added Bonus with Salary for employee : "+ (bonus+sal));
    }
}

public class PolyPrac {
    public static void main(String args[]){
        Robin r = new Robin();
        r.getdata();
    }
}
