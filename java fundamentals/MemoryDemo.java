package javafundamentalstasks;

public class MemoryDemo {
    public static void main(String[] args) {
        // Allocate large memory (Heap Usage)
        int[] memoryEater = new int[10_000_000]; 
        System.out.println("Memory allocated!");

        // Create multiple threads
        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    System.out.println(Thread.currentThread().getName() + " is working...");
                    try {
                        Thread.sleep(1000); // Simulate workload
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, "Worker-" + i);
            t.start();
        }
    }
}

