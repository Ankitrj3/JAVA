
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

        anki rj = (g,h,j) ->{
            System.out.println("addition "+(g+h+j));
        };

        an.multiplication(a,b,c);
        rj.multiplication(a, b, c);
    }
}
