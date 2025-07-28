package task;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void withdraw(int amount, String user) {
        if (amount <= balance) {
            System.out.println(user + " is going to withdraw ₹" + amount);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(user + " successfully withdrew ₹" + amount + ". Remaining balance: ₹" + balance);
        } else {
            System.out.println(user + " tried to withdraw ₹" + amount + " but insufficient balance! Current balance: ₹" + balance);
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); 

        
        Thread user1 = new Thread(() -> {
            account.withdraw(700, "User1");
        });

        Thread user2 = new Thread(() -> {
            account.withdraw(500, "User2");
        });

        user1.start();
        user2.start();
    }
}

