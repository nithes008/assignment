class BankAccount {
    // Private variable - cannot be accessed directly outside this class
    private double balance;

    // Setter method (with validation logic)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500.0);
        
        // System.out.println(account.balance); // Compilation Error (private field)
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
