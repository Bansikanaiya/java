public class Utility {

   
    public static long factorial(long value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
        long result = 1;
        for (long i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

   
    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        if (value <= 3) return true;
        if (value % 2 == 0 || value % 3 == 0) return false;
        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) return false;
        }
        return true;
    }

   
    public static boolean isEven(long value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(long value) {
        return value % 2 != 0;
    }

    public static void main(String[] args) {
        // Test the Utility class methods
        System.out.println("Factorial of 5: " + factorial(5)); // 120
        System.out.println("Is 7 prime? " + isPrime(7)); // true
        System.out.println("Is 8 even? " + isEven(8)); // true
        System.out.println("Is 9 odd? " + isOdd(9)); // true
    }
}
