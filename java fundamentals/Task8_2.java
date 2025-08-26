package javafundamentalstasks;

public class Task8_2 {
    public static void main(String[] args) {
        int x = 5, y = 10;

        // Pre and Post Increment
        System.out.println("Pre/Post Increment:");
        System.out.println("Original x = " + x);
        System.out.println("Pre-increment (++x): " + (++x)); // x becomes 6
        System.out.println("Post-increment (x++): " + (x++)); // prints 6, then x becomes 7
        System.out.println("Value of x after post-increment: " + x);

        // Bitwise Shift Operators
        int a = 8; // binary: 1000
        System.out.println("\nBitwise Shift Operators:");
        System.out.println("a << 1 (Left shift): " + (a << 1)); // 16
        System.out.println("a >> 1 (Right shift): " + (a >> 1)); // 4
        System.out.println("a >>> 1 (Unsigned right shift): " + (a >>> 1)); // 4

        // Logical vs Bitwise AND
        boolean p = true, q = false;
        System.out.println("\nLogical vs Bitwise AND:");
        System.out.println("p && q (Logical AND): " + (p && q));
        System.out.println("p & q (Bitwise AND with booleans): " + (p & q));

        // Extra: Showing with integers
        int m = 6;  // binary: 0110
        int n = 4;  // binary: 0100
        System.out.println("\nBitwise AND with integers:");
        System.out.println("m & n: " + (m & n)); // 4
        System.out.println("m | n: " + (m | n)); // 6
        System.out.println("m ^ n: " + (m ^ n)); // 2
    }
}

