interface Drawable{
    public void draw();
}
public class WithLambdaExp {
    public static void main(String args[]){
        int width = 8;
        Drawable d2 = ()->{
          System.out.println("java version is : "+width); 
        };
        d2.draw();   
    }
}
