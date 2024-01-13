import java.util.*;
public class commandlineifelse {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[1]);
        int count =0;
        if(a>50){
           count++;
        }
        if(b>50){
            count++;
        }
        if(c>50){
            count++;
        }
        if(d>50){
            count++;
        }
        System.out.println("the number of subject pass you pass out 4 subject "+count);
    }
}
