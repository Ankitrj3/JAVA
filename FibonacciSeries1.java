public class FibonacciSeries1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;


        while (firstTerm <= n) {
            System.out.print(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            if(firstTerm<=n){
                System.out.print(" ");
            }
        }
    }
}
