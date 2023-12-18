class pen{
    String color;
    String type;
    String brand;

    public void write(){
        System.out.println("writing something");
       
    }
    public void property(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.brand);
    }
}

public class oops{
      public static void main(String [] args){
        pen p = new pen();
        p.color = "black";
        p.type = "gel";
        p.brand = "bks";

        p.write();
        p.property();
      }
}