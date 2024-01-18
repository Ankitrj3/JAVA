public class Prime {
   
    public boolean checkPrimeOrNot(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        

        int numToCheck = Integer.parseInt(args[0]);

        
        Prime a = new Prime();

        boolean result = a.checkPrimeOrNot(numToCheck);

        if (result) {
            System.out.println(numToCheck + " is a prime number");
        } else {
            System.out.println(numToCheck + " is not a prime number");
        }
    }
}
