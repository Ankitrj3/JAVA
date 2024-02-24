
public class Methodoverloading {
    // method overloading
    public void sum(){
        System.out.println("default value : 1");
    }
    public void sum(int a,int b){
        System.out.println("sum of two numbers : "+(a+b));
    }
    public void sum(int a,int b,int c){
        System.out.println("sum of three numbers : "+(a+b+c));
    }
    public void sum(int a,int b,int c,int d){
        System.out.println("The sum of 4 numbers is "+(a+b+c+d));
    }
    public static void main(String args[]){
        Methodoverloading mc = new Methodoverloading();
        mc.sum();
        mc.sum(4,5,6);
        mc.sum(67,4);

    }
}
