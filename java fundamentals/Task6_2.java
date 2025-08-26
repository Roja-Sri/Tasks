package javafundamentalstasks;

public class Task6_2 {
    private int[] bigArray = new int[10_000_000]; // Large object (~40 MB approx.)

    @Override
    protected void finalize() {
        System.out.println("Large object collected by GC!");
    }

    public static void main(String[] args) {
        System.out.println("Creating large objects...");

        Task6_2 obj1 = new Task6_2();
        Task6_2 obj2 = new Task6_2();
        Task6_2 obj3 = new Task6_2();

        System.out.println("Large objects created.");

        // Nullify references
        obj1 = null;
        obj2 = null;
        obj3 = null;

        System.out.println("Objects set to null. Requesting Garbage Collection...");

        // Suggest JVM to run Garbage Collector
        System.gc();

        System.out.println("Main method completed.");
    }
}

