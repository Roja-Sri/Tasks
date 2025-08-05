package tasks;

class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}



public class Task3 {
	public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        account.deposit(1000.0);     
        account.withdraw(500.0);    

        System.out.println("Final Balance: ₹" + account.getBalance());
    }

}
