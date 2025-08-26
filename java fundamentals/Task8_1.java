package javafundamentalstasks;

public class Task8_1 {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int result;

        // Arithmetic operators
        System.out.println("Arithmetic Operations:");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Assignment operators
        System.out.println("\nAssignment Operations:");
        result = a; 
        result += b; 
        System.out.println("result += b → " + result);

        result = a;
        result -= b;
        System.out.println("result -= b → " + result);

        result = a;
        result *= b;
        System.out.println("result *= b → " + result);

        result = a;
        result /= b;
        System.out.println("result /= b → " + result);

        result = a;
        result %= b;
        System.out.println("result %= b → " + result);
    }
}

