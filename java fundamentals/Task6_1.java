package javafundamentalstasks;

public class Task6_1 {
    @Override
    protected void finalize() {
        System.out.println("Object collected!");
    }

    public static void main(String[] args) {
        Task6_1 obj = new Task6_1();
        obj = null; // Nullify the reference so the object becomes eligible for GC

        // Suggest JVM to run Garbage Collector
        System.gc();

        System.out.println("Main method completed.");
    }
}

