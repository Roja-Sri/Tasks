package multithreadingtasks;

class Chat {
    private boolean senderTurn = true;

    public synchronized void send(String message) {
        while (!senderTurn) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + message);
        senderTurn = false;
        notify(); 
    }

    public synchronized void receive(String message) {
        while (senderTurn) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + message);
        senderTurn = true;
        notify(); 
    }
}

class Sender implements Runnable {
    private Chat chat;

    public Sender(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        String[] messages = { "Hi!", "How are you?", "I’m doing great!" };

        for (String msg : messages) {
            chat.send(msg);
        }
    }
}

class Receiver implements Runnable {
    private Chat chat;

    public Receiver(Chat chat) {
        this.chat = chat;
    }

    public void run() {
        String[] replies = { "Hello!", "I’m fine.", "Nice to hear!" };

        for (String reply : replies) {
            chat.receive(reply);
        }
    }
}

public class Task10 {
    public static void main(String[] args) {
        Chat chat = new Chat();

        Thread senderThread = new Thread(new Sender(chat));
        Thread receiverThread = new Thread(new Receiver(chat));

        senderThread.start();
        receiverThread.start();
    }
}

