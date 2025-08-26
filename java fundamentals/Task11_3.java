package javafundamentalstasks;

public class Task11_3 {
    public static void main(String[] args) {
        int iterations = 100000;

        // Test with String
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken with String: " + (end - start) + " ms");

        // Test with StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuffer: " + (end - start) + " ms");

        // Test with StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("Time taken with StringBuilder: " + (end - start) + " ms");
    }
}
