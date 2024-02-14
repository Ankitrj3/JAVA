import java.util.*;
public class plaindromeusingString {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         String a = sc.nextLine();

         StringBuilder build = new StringBuilder();
         build.append(a);
         build.reverse();

         if(build.toString().equals(a)){
            System.out.println("plaindrome");
         }else{
            System.out.println("not plaindrome");
         }
    }
}
