import java.util.*;

public class updateswitch {
    public static void main(String args []){
       Scanner sc=new Scanner(System.in);

       int n = sc.nextInt();
       switch(n){
         case 1,2 -> System.out.println("hello ankit ranjan");  
         
         case 3 -> System.out.println("hi ankit");

         case 4 -> System.out.println("byebbye  ankit ranjan");

         default -> System.out.println("invalid");
       }

    }
}
