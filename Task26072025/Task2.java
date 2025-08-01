package task;

public class Task2 {
    public static void main(String[] args) {
    	
        RunnableCounter counter = new RunnableCounter();

        Thread t = new Thread(counter);
        t.start();
    }
}

class RunnableCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

