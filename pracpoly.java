import java.util.*;

class student{
    public void info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter information");
        String name = sc.nextLine();
        int roll = sc.nextInt();
        System.out.println(name);
        System.out.println(roll);
    }
}
class information extends student{
    public void info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks and date");
        int marks = sc.nextInt();
        int date = sc.nextInt();
        System.out.println(marks);
        System.out.println(date);
    }
}
class pracpoly{
    public static void main(String args []){
       information s = new information();
       s.info();
    }
}