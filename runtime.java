// runtime polymorfism in java
class run{
    int length;
    int breadth;

    public void area(int length , int breadth){
        System.out.println(breadth*length+" area 1");
    }
}
class run1 extends run{
    public void area(int length,int breadth){
        System.out.println(breadth*length+ " area 2");
    }
}
class runtime{
    public static void main(String args []){
        run1 e = new run1();
        e.area(12,3);
    }
}
