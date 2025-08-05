package multithreadingtasks;

public class Task12 {
    public static void main(String[] args) {
        Thread countdownThread = new Thread(() -> {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Time’s up!");
        });

        countdownThread.start();
    }
}
