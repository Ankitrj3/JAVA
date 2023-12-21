package ankit;
import java.util.*;

class shape{
    double base;
    double height;
    public void main(){
        System.out.println("display area");
    }
}

class Triangle extends shape{
    public void main(double base,double height){
      
        System.out.println(1/2*base*height);
    }
}
class equlateraltriangle extends Triangle{
    public void main(double base,double height){
        
        System.out.println(base*height);
    }
}
class Ineri{
    public static void main(String args []){
        equlateraltriangle a = new equlateraltriangle();
        a.main(32.3,45.45);

       
    }
}