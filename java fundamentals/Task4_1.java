package javafundamentalstasks;

public class Task4_1 {
    public static void main(String[] args) {
        final int x = 10;             // final keyword
        int y = 5;                    // int keyword

        if (x > y) {                  // if keyword
            System.out.println("x is greater than y");
        } else {                      // else keyword
            System.out.println("y is greater than or equal to x");
        }

        for (int i = 0; i < 3; i++) { // for keyword
            System.out.println("Loop iteration: " + i);
        }

        while (y < x) {               // while keyword
            y++;
        }

        do {                          // do keyword
            y--;
        } while (y > 0);

        boolean flag = true;          // boolean keyword
        switch (y) {                  // switch keyword
            case 0:                   // case keyword
                System.out.println("y is zero");
                break;                // break keyword
            default:                  // default keyword
                System.out.println("y is non-zero");
        }

        try {                         // try keyword
            int result = x / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {       // catch keyword
            e.printStackTrace();
        } finally {                   // finally keyword
            System.out.println("End of program.");
        }
    }
}
