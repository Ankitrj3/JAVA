public class TextFormating {
    public static void main(String[] args) {
        double a = 12.342;

        System.out.printf("%08f\n", a); // Output: 0012.342000
        System.out.printf("%+f\n", a); // Output: +12.342000
        System.out.printf("%2f\n", a); // Output: 12.342
    }
}
