package Task;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

class BankingApp {
    private int balance;

    public BankingApp(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount) throws MinimumBalanceException {
        if (balance - amount < 1000) {
            throw new MinimumBalanceException("Withdrawal denied: Minimum balance ₹1000 must be maintained.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful.");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Task5_6 {
    public static void main(String[] args) {
        BankingApp account = new BankingApp(5000); 

        account.showBalance();

        try {
            account.withdraw(3000); 
        } catch (MinimumBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        account.showBalance();
    }
}
