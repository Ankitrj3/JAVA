
// single level inheritance
class first{
    String name;
    int marks;
    public void main(String name){
    System.out.println("your name is "+name);
}
}
class second extends first{
    public void child(int marks){
        System.out.println("your marks is "+marks);
    }
}

class main1{
    public static void main(String args []){
        second s = new second();
        s.main("ankit");
        s.child(4);
    }
}