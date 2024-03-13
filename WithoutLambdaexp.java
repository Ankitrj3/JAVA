
// Without lambda expersion
interface Drawable{
    public void draw();
}
public class WithoutLambdaexp {
    public static void main(String args[]){
        int width = 8;
        Drawable d = new Drawable() {
            public void draw(){System.out.println("java version : "+width);}
        };
        d.draw();   
    }
}
