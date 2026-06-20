

    class BankAccount {

        private String accountHolder;
        private double balance;
    
        // Constructor
        BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
    
        // Deposit
        public void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    
        // Withdraw
        public void withdraw(double amount) {
    
            if (amount > balance) {
                System.out.println("Insufficient Balance!");
            } else {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            }
        }
    
        // Display Balance
        public void checkBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Current Balance: " + balance);
        }
    }
    
    public class Main {
    
        public static void main(String[] args) {
    
            BankAccount b1 =
                    new BankAccount("Sumit", 5000);
    
            b1.checkBalance();
    
            b1.deposit(2000);
    
            b1.withdraw(1000);
    
            b1.checkBalance();
        }
    }
