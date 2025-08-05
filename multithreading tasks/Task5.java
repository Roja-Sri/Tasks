package multithreadingtasks;

public class Task5 {
    public static void main(String[] args) {

        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            System.out.println(name + " is running with priority: " + priority);
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}