package Task;

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int balance) throws InvalidAccountException {
        if (balance < 0) {
            throw new InvalidAccountException("Account balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Account Balance: ₹" + balance);
    }
}

public class Task5_5 {
    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(-500); 
            account.showBalance();
        } catch (InvalidAccountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

