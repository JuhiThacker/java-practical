import java.util.Scanner;
public class utility {
    public static long factorial(long value) {
        if (value < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 for invalid input
        }
        long result = 1;
        for (long i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }
    public static boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is even
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    // Method to check if a number is odd
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        long num = scanner.nextLong();
        long factResult = factorial(num);
        if (factResult != -1) {
            System.out.println("Factorial of " + num + " is: " + factResult);
        }

        System.out.print("Enter a number to check if it is prime: ");
        int primeCheck = scanner.nextInt();
        System.out.println("Is " + primeCheck + " prime? " + isPrime(primeCheck));

        System.out.print("Enter a number to check if it is even: ");
        int evenCheck = scanner.nextInt();
        System.out.println("Is " + evenCheck + " even? " + isEven(evenCheck));

        System.out.print("Enter a number to check if it is odd: ");
        int oddCheck = scanner.nextInt();
        System.out.println("Is " + oddCheck + " odd? " + isOdd(oddCheck));

        scanner.close();
    }
}
