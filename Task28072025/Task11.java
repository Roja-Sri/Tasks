package task;

import java.util.Random;

class Runner implements Runnable {
    private String name;
    private Random random = new Random();

    public Runner(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": running... (" + i + ")");
            try {
                Thread.sleep(random.nextInt(1000)); // Sleep 0 to 999 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + ": finished!");
    }
}

public class Task11 {
    public static void main(String[] args) {
        Thread tortoise = new Thread(new Runner("Tortoise"));
        Thread rabbit = new Thread(new Runner("Rabbit"));
        Thread dog = new Thread(new Runner("Dog"));

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}

