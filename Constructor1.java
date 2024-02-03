public class Constructor1 {
    private String name;
    private int age;
    private String Degree;

    public Constructor1(String name, int age,String Degree){
        this.name = name;
        this.age = age;
        this.Degree = Degree;
    }
    public String toString(){
        return "Person [NAME : "+name +", AGE : "+age+", DEGREE : "+Degree+"]";
    }

    public static void main(String args[]){
        Constructor1 c1 = new Constructor1("Ankit Ranjan", 20, "B.TECH IN CSE");
        Constructor1 c2 = new Constructor1("Dinesh", 20, "B.TECH IN CSE");

        String x = c1.toString();
        String y = c2.toString();

        System.out.println(x);
        System.out.println(y);
    }
}
