
interface anki {
  void multiplication(int a,int b,int c); 
}
public class WithLambdaMulti {
    public static void main(String[] args) {
        int a=12;
        int b=23;
        int c=90;

        anki an = (x,y,z)->{
            System.out.println("multiplication "+(x*y*z));
        };

        an.multiplication(a,b,c);
    }
}
