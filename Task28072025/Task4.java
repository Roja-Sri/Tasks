package task;

public class Task4 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join: " + t.isAlive());
    }
}
