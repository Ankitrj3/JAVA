public class MethodOverloadingExample {

    // Method with one parameter of type int
    public static int add(int a) {
        return a + 5;
    }

    // Method with two parameters of type int
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with two parameters of type double
    public static double add(double a, double b) {
        return a + b;
    }

    // Method with three parameters of type int
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Adding one number: " + add(5));
        System.out.println("Adding two numbers: " + add(10, 20));
        System.out.println("Adding two double numbers: " + add(2.5, 3.5));
        System.out.println("Adding three numbers: " + add(5, 10, 15));
    }
}
