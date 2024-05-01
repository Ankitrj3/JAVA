import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the range from the user
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        
        // Display prime numbers within the given range
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // 0 and 1 are not prime numbers
        if (number <= 1) {
            return false;
        }
        
        // Check for factors up to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        // If no factors are found, the number is prime
        return true;
    }
}
