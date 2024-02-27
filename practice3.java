// inheritance practice
import java.util.*;
class employee{
    int id;
    String name;
    String department;
    
    void getdata(){
        Scanner ank = new Scanner(System.in);
         System.out.println("Enter the id ");
         id = ank.nextInt();
         ank.nextLine();
         System.out.println("Enter your name ");
         name = ank.nextLine();
         System.out.println("Enter the department");
         department = ank.nextLine();
    }
    void display(){
        System.out.println("Your Employee id : "+id);
        System.out.println("Your Name is : "+name);
        System.out.println("Your Department is : "+department);
    } 
}
class emp2 extends employee{
    double salary;
    double bonus;
    void get(){
        Scanner ank = new Scanner(System.in);
        System.out.println("Enter the salary");
        salary = ank.nextDouble();
        System.out.println("Enter the bonus");
        bonus = ank.nextDouble();

    }
    void put(){
        System.out.println("The salary after bonus : "+(salary+bonus));
    }
}

class practice3{
    public static void main(String args[]){
        emp2 rj  = new emp2();
        rj.getdata();
        rj.display();
        rj.get();
        rj.put();
    }
}