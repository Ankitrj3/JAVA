import java.util.*;

class tower{
    public void honai(int n,char s,char a,char d){
        if(n==1){
            System.out.println("move 1 ring "+s+" to "+d);
            return;
        }
        honai(n-1,s,d,a);
        System.out.println("Move "+n+" ring "+s+" to "+d);
        honai(n-1, a, s, d);
    }
}

class toh{
    public static void main(String args [] ){
         tower t  = new tower();
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         t.honai(n,'A','B','C');
    }
}