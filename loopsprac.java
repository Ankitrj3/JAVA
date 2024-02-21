import java.util.*;
public class loopsprac {
    public static void main(String args[]){
        Scanner ank = new Scanner(System.in);
        // for loop 
        System.out.println("enter the number upto which your loop will iterrate");
        int n = ank.nextInt();
        
        System.out.println("for loop");
        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
        // while loop
        System.out.println("while");
        int i=0;
        while(i<n){
            System.out.println(i);
            i++;
        }

        // do-while loop 
        int k =0;
        System.out.println("do-while loop");
        do{
            System.out.println(k);
            k++;
        }while(k<=n);

        // for-each loop
        String  arr[] = {"ankit","ranjan","robin","rj","rocky"};
        for(String j : arr){
            System.out.println(j);
        }
    }
}
