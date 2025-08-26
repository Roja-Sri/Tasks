package javafundamentalstasks;

public class Task9_3 {
    public static void main(String[] args) {
        int count = 0;   // number of primes found
        int number = 2;  // candidate number to check

        System.out.println("First 10 prime numbers:");

        for (; count < 10; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

