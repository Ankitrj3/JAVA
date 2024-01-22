import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int secondTerm = 1;
        for(int firstTerm = 0; firstTerm<=n;firstTerm++){
            System.out.print(firstTerm);

            int newTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = newTerm;

            if(firstTerm<=n){
                System.out.print(" ");
            }
        }
    }
}
