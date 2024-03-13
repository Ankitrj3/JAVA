interface javaable{
    public String say();
}
public class WithLambdaNoparameter {
    public static void main(String[] args) {
        javaable ab = ()->{
            return "java with lambda";
        };
        System.out.println(ab.say());
    }
}
