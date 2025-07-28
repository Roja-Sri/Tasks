package task;

public class Task1 {
    public static void main(String[] args) {
        MyPrinterThread t = new MyPrinterThread();
        t.start();  // Start the thread
    }
}

class MyPrinterThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
